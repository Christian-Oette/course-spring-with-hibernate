package de.oette.course.G05;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "title")
    private String title;

    private List<Actor> actors = new ArrayList<>();

    public List<Actor> getActors() {
        return actors;
    }

    public void addActor(Actor actor) {
        this.actors.add(actor);
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
