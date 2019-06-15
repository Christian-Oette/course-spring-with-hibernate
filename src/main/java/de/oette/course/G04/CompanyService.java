package de.oette.course.G04;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
public class CompanyService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void onStartup() {
        createCompaniesAndClients();
    }

    private void createCompaniesAndClients() {

    }
}
