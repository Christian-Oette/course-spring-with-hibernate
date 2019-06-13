package de.oette.course.F01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class PropertyDemoComponent {

    @EventListener(ApplicationReadyEvent.class)
    public void onStartup() {

    }
}
