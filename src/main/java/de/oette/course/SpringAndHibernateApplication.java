package de.oette.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SuppressWarnings("SpellCheckingInspection")
@SpringBootApplication
@ComponentScan(basePackages = "de.oette.course.A03.sub1")
public class SpringAndHibernateApplication {

	public static void main(final String[] args) {
		SpringApplication.run(SpringAndHibernateApplication.class, args);
	}

}
