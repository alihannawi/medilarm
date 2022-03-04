package perscholas.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import perscholas.database.entities.Alarm;

public interface AlarmDAO extends JpaRepository<Alarm , Long> {


}
