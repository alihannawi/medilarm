package perscholas.database.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "medicine_name")
    private String medicineName;

    @Column(name = "dosage")
    private String dosage;

    @Column(name = "daily_dose")
    private int dailyDose;

    @Column(name = "timeframe")
    private String timeframe;

    @Column(name = "timeframe_id")
    private int timeframeId;
}
