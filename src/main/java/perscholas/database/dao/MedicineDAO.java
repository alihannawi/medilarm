package perscholas.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import perscholas.database.entities.Medicine;

public interface MedicineDAO extends JpaRepository<Medicine, Long> {
}
