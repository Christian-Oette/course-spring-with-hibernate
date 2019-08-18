package de.oette.course.H04.analytics;

import de.oette.course.H04.customer.CustomerCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;

@Service
public class H04AnalyticsService {

    @PersistenceContext
    private EntityManager entityManager;

    @TransactionalEventListener(value = CustomerCreatedEvent.class, phase = TransactionPhase.AFTER_COMPLETION)
    public void onCustomerCreation() {
        entityManager.persist(new H04CustomerAnalytics(LocalDate.now()));
        System.out.println("Great, we have new customer.");
        throw new RuntimeException("Ups, analytics failed");
    }
}
