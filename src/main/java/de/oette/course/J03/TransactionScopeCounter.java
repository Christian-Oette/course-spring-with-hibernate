package de.oette.course.J03;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TransactionScopeCounter {

    @Id
    @GeneratedValue
    public long id;

    private long count = 1;

    public long getCount() {
        return count;
    }

    public void countUp() {
        this.count++;
    }
}
