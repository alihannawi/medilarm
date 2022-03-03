package perscholas.database.entities;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

//    @NonNull
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "user_id")
//    private User user;

//    @OneToOne(mappedBy = "medicine")
//    private UserAlarm alarm;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "medicine_name")
    private String medicineName;

    @Column(name = "dosage")
    private String dosage;

    @Column(name = "daily_dose")
    private int dailyDose;

    @Column(name = "medicine_alarm_id")
    private int medicineAlarmId;
}
