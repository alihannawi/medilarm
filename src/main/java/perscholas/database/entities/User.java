package perscholas.database.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
//    @SequenceGenerator(
//            name = "user_seq" ,
//            sequenceName = "user_seq" ,
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE ,
//            generator = "user_seq"
//    )
//    ^ start 1 increment 1
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToMany(targetEntity = Medicine.class)
    private List<Medicine> alarms;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "password")
    private String password;

}
