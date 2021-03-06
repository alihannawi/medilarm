package perscholas.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import perscholas.database.entities.Medicine;

import java.util.List;

public interface MedicineDAO extends JpaRepository<Medicine, Long> {

    @Override
    List<Medicine> findAll();

    Medicine findById(Integer id);
}
