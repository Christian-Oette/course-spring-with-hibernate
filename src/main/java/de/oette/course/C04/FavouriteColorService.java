package de.oette.course.C04;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class FavouriteColorService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void storeColor(String colorName) {
        // TODO Implement me!
    }

    @Transactional
    public List<FavouriteColor> loadColors() {
        // TODO Implement me!
        return new ArrayList<>();
    }
}
