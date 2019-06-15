package de.oette.course.G05;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@EntityScan(basePackages = "de.oette.course.G05")
public class MovieTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    @Transactional
    public void testMovieAndActors() {
        // given
        Movie movie = new Movie();
        movie.setTitle("Mission Impossible");
        movie.addActor(new Actor("Tom Cruise"));
        movie.addActor(new Actor("Ving Rhames"));
        movie.addActor(new Actor("Simon Pegg"));
        entityManager.persist(movie);
        entityManager.flush();
        entityManager.clear();

        //when
        TypedQuery<Movie> query = entityManager.createQuery("select m from Movie m", Movie.class);
        List<Movie> resultList = query.getResultList();

        // then
        assertThat(resultList).isNotEmpty().hasSize(1);
        assertThat(resultList).extracting(Movie::getActors).hasSize(3);
    }
}
