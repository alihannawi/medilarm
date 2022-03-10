package perscholas.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import perscholas.database.entities.Medicine;
import perscholas.database.entities.MedicineTime;

import java.util.List;

public interface MedicineTimeDAO extends JpaRepository<MedicineTime, Integer> {

    List<MedicineTime> findAll();
}