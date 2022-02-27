package perscholas.database.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "user_alarm")
public class UserAlarm {

    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "medicine_id")
    private int medicineId;
}
