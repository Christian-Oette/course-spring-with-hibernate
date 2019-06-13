package de.oette.course.F02;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * property.demo.inject
 * property.demo.environment-var
 */
@Component
public class PropertyDemoComponent {

    private final PropertyBundle propertyBundle;

    public PropertyDemoComponent(PropertyBundle propertyBundle) {
        this.propertyBundle = propertyBundle;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onStartup() {
        System.out.println(propertyBundle.getInject());
        System.out.println(propertyBundle.getSubCategory().getValue1());
        System.out.println(propertyBundle.getSubCategory().getValue2());
    }
}
