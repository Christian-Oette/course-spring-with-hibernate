package de.oette.course.C01;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DemoEntity {

    @Id
    @GeneratedValue
    private Long id;
}
