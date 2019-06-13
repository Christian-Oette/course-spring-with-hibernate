package de.oette.course.F02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * property.demo.inject
 * property.demo.environment-var
 */
@Component
public class PropertyDemoComponent {

    private final String property1;
    private final String property2;

    public PropertyDemoComponent(@Value("${property.demo.inject}") String property1,
                                 @Value("${property.demo.environment-var}") String property2) {
        this.property1 = property1;
        this.property2 = property2;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onStartup() {
        System.out.println(property1);
        System.out.println(property2);
    }
}
