package de.oette.course.H03;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * curl -XPOST localhost:8080/trigger-event
 *
 * Refactor to @GetMapping if you can't use curl!
 * Then open browser and enter localhost:8080/trigger-event
 */
@RestController
public class H03Controller {

    private final ApplicationEventPublisher applicationEventPublisher;

    public H03Controller(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @PostMapping("/trigger-event")
    public void triggerEvent() {
        applicationEventPublisher.publishEvent(new TaskCompletedEvent(this, "Task 21"));
    }
}
