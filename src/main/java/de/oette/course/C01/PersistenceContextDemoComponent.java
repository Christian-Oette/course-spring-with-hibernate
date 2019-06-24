package de.oette.course.C01;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class PersistenceContextDemoComponent {

    @EventListener(ApplicationReadyEvent.class)
    public void onStartup() {

    }
}
