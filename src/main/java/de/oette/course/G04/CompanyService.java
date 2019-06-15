package de.oette.course.G04;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
public class CompanyService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @EventListener(value = ApplicationReadyEvent.class)
    public void onStartup() {
        createCompaniesAndClients();
        loadFromDatabase();
    }

    private void loadFromDatabase() {

    }

    private void createCompaniesAndClients() {

    }
}
