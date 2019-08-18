package de.oette.course.H04.analytics;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "customer_analytics")
public class H04CustomerAnalytics {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "created_date")
    private LocalDate createdDate;

    protected H04CustomerAnalytics() {
        // default constructor for loading from db
    }

    public H04CustomerAnalytics(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}
