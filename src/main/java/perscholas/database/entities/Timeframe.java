package perscholas.database.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "timeframe")
public class Timeframe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "tf_start")
    private int tfStart;

    @Column(name = "tf_end")
    private int tfEnd;
}
