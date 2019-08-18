package de.oette.course.H04.customer;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
public class H04CustomerService {

    private final EntityManager entityManager;
    private final ApplicationEventPublisher applicationEventPublisher;

    public H04CustomerService(EntityManager entityManager, ApplicationEventPublisher applicationEventPublisher) {
        this.entityManager = entityManager;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Transactional
    public void createCustomer() {
        H04Customer customer = new H04Customer();
        entityManager.persist(customer);
        applicationEventPublisher.publishEvent(new CustomerCreatedEvent(this, customer));
    }
}
