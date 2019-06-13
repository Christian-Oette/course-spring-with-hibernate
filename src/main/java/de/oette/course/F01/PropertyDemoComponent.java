package de.oette.course.F01;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * property.demo.inject=Example of injection
 * property.demo.environment-var=${param}
 */
@Component
public class PropertyDemoComponent {

    @EventListener(ApplicationReadyEvent.class)
    public void onStartup() {

    }
}
