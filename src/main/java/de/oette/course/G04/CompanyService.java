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
        Company company = entityManager.find(Company.class, 1L);
        company.getClients().forEach(System.out::println);
    }

    private void createCompaniesAndClients() {
        Client client = new Client();
        Company company = new Company();
        entityManager.persist(company);

        company.addClient(client);
        client.setCompany(company);
    }
}
