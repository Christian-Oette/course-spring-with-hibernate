package de.oette.course.H03;

import org.springframework.context.ApplicationEvent;

public class TaskCompletedEvent extends ApplicationEvent {

    private String taskName;

    public TaskCompletedEvent(Object source, String taskName) {
        super(source);
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }
}
