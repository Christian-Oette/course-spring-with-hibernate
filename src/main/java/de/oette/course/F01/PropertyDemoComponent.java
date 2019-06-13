package de.oette.course.F01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * property.demo.inject=Example of injection
 * property.demo.inject2=99
 * property.demo.environment-var=${param}
 */
@Component
public class PropertyDemoComponent {

    @EventListener(ApplicationReadyEvent.class)
    public void onStartup() {
        
    }
}
