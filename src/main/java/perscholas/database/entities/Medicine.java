package perscholas.database.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

//    @ManyToMany(
//            mappedBy = "medicines" ,
//            fetch = FetchType.LAZY
//    )
//    private Set<User> users = new HashSet<>();

    @ManyToMany(mappedBy = "medicines")
    private Set<User> users;

    @OneToMany(mappedBy = "medicine")
    private Set<UserMedicine> userMedicines;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "medicine_name")
    private String medicineName;

    @Column(name = "dosage")
    private String dosage;

    @Column(name = "daily_dose")
    private String dailyDose;
//
//    @Column(name = "timeframe")
//    private String timeframe;
}
