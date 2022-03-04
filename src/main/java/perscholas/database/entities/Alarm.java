package perscholas.database.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "alarm")
public class Alarm {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "timestamp")
    private int timestamp;
}
