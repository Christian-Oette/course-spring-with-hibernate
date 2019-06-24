package de.oette.course.C02;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class PersistDemoComponent {

    @PersistenceContext
    private EntityManager entityManager;

    @EventListener(value = ApplicationReadyEvent.class)
    public void onStartup() {

    }
}
