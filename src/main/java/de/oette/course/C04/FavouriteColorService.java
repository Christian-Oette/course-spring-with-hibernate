package de.oette.course.C04;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Service
public class FavouriteColorService {

    @PersistenceContext
    private EntityManager entityManager;

    public void storeColor(String colorName) {
        // TODO Implement me!
    }

    public List<FavouriteColor> loadColors() {
        // TODO Implement me!
        return new ArrayList<>();
    }
}
