package de.oette.course.G01;

import javax.persistence.*;

@Entity
@Table(name = "derby_demo")
public class DerbyDemoEntity {

    @Id
    private long id = 1;

    @Column(name = "number_of_restarts")
    private Long nrOfRestarts = 1L;


    public void increaeRestarts() {
        if (nrOfRestarts == null) {
            nrOfRestarts = 1L;
        }
        nrOfRestarts++;
    }

    public long getNrOfRestarts() {
        return nrOfRestarts;
    }
}
