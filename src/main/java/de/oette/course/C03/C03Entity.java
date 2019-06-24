package de.oette.course.C03;

import org.apache.commons.lang3.RandomStringUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class C03Entity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name = RandomStringUtils.randomAlphanumeric(8);
}
