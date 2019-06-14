package de.oette.course.G01;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Optional;

@Component
public class PostgresDemoComponent {

    @PersistenceContext
    private EntityManager entityManager;

    @EventListener(ApplicationReadyEvent.class)
    @Transactional
    public void saveNewEntity() {
        Optional<PostgresDemoEntity> entityOptional = Optional.ofNullable(entityManager.find(PostgresDemoEntity.class, 1L));
        long nrOfRestarts = 1;
        if (entityOptional.isPresent()) {
            PostgresDemoEntity entity = entityOptional.get();
            entity.increaeRestarts();
            nrOfRestarts = entity.getNrOfRestarts();
        } else {
            createNewEntity();
        }

        System.out.println("Nr of restarts: "+nrOfRestarts);
    }

    private PostgresDemoEntity createNewEntity() {
        PostgresDemoEntity entity = new PostgresDemoEntity();
        entityManager.persist(entity);
        return entity;
    }
}
