package de.oette.course.C02;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.metamodel.EntityType;
import javax.transaction.Transactional;
import java.util.Set;

@Component
public class PersistDemoComponent {

    @PersistenceContext
    private EntityManager entityManager;

    private int count = 1;

    @Transactional
    public void peristEntity() {
        entityManager.persist(new DemoEntityWithName());
        if (count % 3 == 0) throw new RuntimeException("BOOM");
        count++;
    }
}
