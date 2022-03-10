package perscholas.database.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "medicine_time")
public class MedicineTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "medicine_name")
    private String medicineName;

    @Column(name = "dosage")
    private String dosage;

    @Column(name = "daily_dose")
    private String dailyDose;

    @Column(name = "timeframe")
    private String timeframe;

    @Column(name = "timestamp")
    private String timestamp;
}
