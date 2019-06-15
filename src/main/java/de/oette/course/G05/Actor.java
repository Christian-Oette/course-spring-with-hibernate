package de.oette.course.G05;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Actor {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    private Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }
}
