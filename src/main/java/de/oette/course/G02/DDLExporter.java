package de.oette.course.G02;

import org.hibernate.boot.SchemaAutoTooling;
import org.hibernate.dialect.PostgreSQL95Dialect;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.instrument.classloading.SimpleThrowawayClassLoader;
import org.springframework.orm.jpa.persistenceunit.MutablePersistenceUnitInfo;

import javax.persistence.Entity;
import java.io.File;
import java.util.List;
import java.util.Properties;

import static java.util.stream.Collectors.toList;
import static org.hibernate.cfg.AvailableSettings.*;


/**
 * Generates SQL schema file from annotated entities. Does not interact with the database.
 * <p>
 * Idea taken from <a href="http://stackoverflow.com/questions/27314165/generate-ddl-script-at-maven-build-with-hibernate4-jpa-2-1"/>
 */
public class DDLExporter {

	private static final String SCHEMA_FILE_NAME = "schema.sql";
	private static final String SCHEMA_FILE_PATH = "./generated/ddl";
	public static final String PACKAGE = "de.oette.course";

	public static void main(String[] args) {
		new DDLExporter().execute();
	}

	public void execute() {
		String path = SCHEMA_FILE_PATH + SCHEMA_FILE_NAME;

		// Remove file if exists otherwise schema will be appended to existing file
		new File(path).delete();

		System.out.println("Generating DDL create script to: " + path);

		MutablePersistenceUnitInfo persistenceUnitInfo = new MutablePersistenceUnitInfo() {
			@Override
			public ClassLoader getNewTempClassLoader() {
				return new SimpleThrowawayClassLoader(this.getClassLoader());
			}
		};
		persistenceUnitInfo.setPersistenceProviderClassName(HibernatePersistenceProvider.class.getName());
		persistenceUnitInfo.setProperties(createHibernateProperties());
		persistenceUnitInfo.setPersistenceUnitName("schema-gen");
		getEntityClassNames().forEach(persistenceUnitInfo::addManagedClassName);

		new HibernatePersistenceProvider().generateSchema(persistenceUnitInfo, createPersistenceProperties(path));
	}

	private Properties createHibernateProperties() {
		Properties hibernateProperties = new Properties();
		hibernateProperties.put(FORMAT_SQL, "true");
		hibernateProperties.put(DIALECT, PostgreSQL95Dialect.class.getName());
		hibernateProperties.put(HBM2DDL_AUTO, SchemaAutoTooling.CREATE.name().toLowerCase());
		return hibernateProperties;
	}

	private Properties createPersistenceProperties(String path) {
		final Properties persistenceProperties = new Properties();
		persistenceProperties.setProperty(HBM2DDL_DATABASE_ACTION, "none");
		persistenceProperties.setProperty(HBM2DDL_SCRIPTS_ACTION, "create");
		persistenceProperties.setProperty(HBM2DDL_CREATE_SOURCE, "metadata");
		persistenceProperties.setProperty(HBM2DDL_SCRIPTS_CREATE_TARGET, path);
		persistenceProperties.setProperty(HBM2DDL_DELIMITER, ";");
		return persistenceProperties;
	}

	private List<String> getEntityClassNames() {
		ClassPathScanningCandidateComponentProvider provider = new ClassPathScanningCandidateComponentProvider(false);
		provider.addIncludeFilter(new AnnotationTypeFilter(Entity.class));
		return provider.findCandidateComponents(PACKAGE).stream().map(BeanDefinition::getBeanClassName).collect(toList());
	}
}
