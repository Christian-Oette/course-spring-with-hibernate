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
        entityManager.flush();
        entityManager.clear();
        loadFromDatabase();
    }

    private void loadFromDatabase() {
        Address address = entityManager.find(Address.class, 1L);
        System.out.println(address.getCompany().getId());
    }

    private void createCompaniesAndClients() {
        Address address = new Address();
        entityManager.persist(address);

        Company company = new Company();
        company.setAddress(address);
        entityManager.persist(company);
    }
}
