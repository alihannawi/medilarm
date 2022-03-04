package perscholas.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import perscholas.database.entities.UserMedicine;

public interface UserMedicineDAO extends JpaRepository<UserMedicine, Long> {
}
