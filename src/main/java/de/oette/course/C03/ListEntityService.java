package de.oette.course.C03;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Component
public class ListEntityService {

    @PersistenceContext
    private EntityManager entityManager;

    List<C03Entity> getList() {
        // TODO Implement me!
        return new ArrayList<>();
    }
}
