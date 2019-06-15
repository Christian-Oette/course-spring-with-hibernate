package de.oette.course.G04;

import javax.persistence.*;
import java.util.List;

@Entity
public class Company {

    @Id
    private Long id = 1L;



    public Long getId() {
        return id;
    }
}
