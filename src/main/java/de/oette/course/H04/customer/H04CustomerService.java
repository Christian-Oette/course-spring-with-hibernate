package de.oette.course.H04.customer;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class H04CustomerService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void createCustomer() {
        entityManager.persist(new H04Customer());
    }
}
