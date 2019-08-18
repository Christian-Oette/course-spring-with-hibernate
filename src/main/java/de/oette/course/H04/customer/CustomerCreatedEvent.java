package de.oette.course.H04.customer;

import org.springframework.context.ApplicationEvent;

public class CustomerCreatedEvent extends ApplicationEvent {

    private final H04Customer customer;

    public CustomerCreatedEvent(Object source, H04Customer customer) {
        super(source);
        this.customer = customer;
    }

    public H04Customer getCustomer() {
        return customer;
    }
}
