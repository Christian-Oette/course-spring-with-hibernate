package de.oette.course.H02;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class H02EventService {

    @EventListener(ApplicationReadyEvent.class)
    public void listenToReadyEvent() {
        System.out.println("Application is ready");
    }

    @EventListener(ContextClosedEvent.class)
    public void listenToClosedEvent() {
        System.out.println("Context is closed");
    }

    @EventListener(ApplicationFailedEvent.class)
    public void listenToFailedEvent() {
        System.out.println("Application has failed");
    }
}
