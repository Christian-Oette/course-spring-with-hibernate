package de.oette.course.F01;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * property.demo.inject=Example of injection
 * property.demo.inject2=99
 * property.demo.environment-var=${param}
 * property.demo.subclass.value1=value1
 * property.demo.subclass.value2=value2
 */
@Component
public class PropertyBundle {

}
