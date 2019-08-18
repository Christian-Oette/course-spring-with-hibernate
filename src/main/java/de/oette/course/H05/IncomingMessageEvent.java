package de.oette.course.H05;

import org.springframework.context.ApplicationEvent;

public class IncomingMessageEvent extends ApplicationEvent {

    private final String receiver;
    private final String text;

    public IncomingMessageEvent(Object source, String receiver, String text) {
        super(source);
        this.receiver = receiver;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getReceiver() {
        return receiver;
    }
}
