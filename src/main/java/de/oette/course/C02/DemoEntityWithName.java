package de.oette.course.C02;

import org.apache.commons.lang3.RandomStringUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DemoEntityWithName {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name = RandomStringUtils.randomAlphanumeric(8);
}
