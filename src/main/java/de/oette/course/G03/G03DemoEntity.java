package de.oette.course.G03;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class G03DemoEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private LocalDate startDate;

    @Column
    @Enumerated(value = EnumType.STRING) // SPADE, DIAMOND, CLUB, HEART
    private CardType cardType;


    @Column
    @Enumerated(value = EnumType.ORDINAL) // 1, 2, 3, 4
    private CardType secondCardType;

}
