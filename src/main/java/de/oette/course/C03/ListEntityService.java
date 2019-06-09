package de.oette.course.C03;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
public class ListEntityService {

    @PersistenceContext
    private EntityManager entityManager;

    List<C03Entity> getList() {

        //return getListWithNativeQuery();
        return getListWithJPQLQuery();
    }

    private List<C03Entity> getListWithJPQLQuery() {
        String queryString = "select c03 from C03Entity c03";
        TypedQuery<C03Entity> query = entityManager.createQuery(queryString, C03Entity.class);
        return query.getResultList();
    }

    private List<C03Entity> getListWithNativeQuery() {
        String nativeQueryString = "select * from c03_entity";
        Query query = entityManager.createNativeQuery(nativeQueryString, C03Entity.class);
        return query.getResultList();
    }

    @Transactional
    public void createEntities() {
        entityManager.persist(new C03Entity());
    }
}
