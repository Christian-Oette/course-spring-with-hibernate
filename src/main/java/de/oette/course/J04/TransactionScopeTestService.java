package de.oette.course.J04;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
@Transactional(value = Transactional.TxType.REQUIRES_NEW)
public class TransactionScopeTestService {

    @PersistenceContext
    private EntityManager entityManager;

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        entityManager.persist(new TransactionScopeCounter());
    }

    public long countNumberUp() {
        TransactionScopeCounter tsCounter = loadCounter();
        tsCounter.countUp();
        return tsCounter.getCount();
    }

    public TransactionScopeCounter loadCounter() {
        return entityManager.getReference(TransactionScopeCounter.class, 1L);
    }
}
