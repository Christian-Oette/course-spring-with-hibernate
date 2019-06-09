package de.oette.course.C03;

import org.apache.commons.lang3.RandomStringUtils;

import javax.persistence.*;

@Entity
@Table(name = "c03_entity")
public class C03Entity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name = RandomStringUtils.randomAlphanumeric(8);

    public String getName() {
        return name;
    }
}
