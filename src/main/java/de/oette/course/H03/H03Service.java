package de.oette.course.H03;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class H03Service {

    @EventListener(TaskCompletedEvent.class)
    public void listenToTaskEvents(TaskCompletedEvent event) {
        System.out.println(String.format("Task %s has been completed", event.getTaskName()));
    }
}
