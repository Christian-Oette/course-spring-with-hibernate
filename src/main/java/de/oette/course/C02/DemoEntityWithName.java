package de.oette.course.C02;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DemoEntityWithName {

    @Id
    @GeneratedValue
    private Long id;

}
