package de.oette.course.G04;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {

    @Id
    private Long id = 1L;


    public Long getId() {
        return id;
    }
}
