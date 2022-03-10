package perscholas;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import perscholas.database.dao.MedicineDAO;
import perscholas.database.entities.Medicine;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MedicineDAOTest {

    @Autowired
    private MedicineDAO medicineDAO;

    Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    @Test
    public void testAddNew(){

        Medicine medicine = new Medicine();
        medicine.setBrandName("Test");
        medicine.setMedicineName("Test");
        medicine.setDosage("Test");
        medicine.setDailyDose("Test");
        medicineDAO.save(medicine);

        Assertions.assertThat(medicine).isNotNull();
        Assertions.assertThat(medicine.getId()).isGreaterThan(0);
    }

    @Test
    public void testListAll(){
        Iterable<Medicine> medicines = medicineDAO.findAll();
        Assertions.assertThat(medicines).hasSizeGreaterThan(0);
        medicines.forEach(medicine -> logger.log(Level.WARNING, medicine.toString()));
    }

    @Test
    public void testUpdate(){
        Integer id = 4;
        Medicine medicine = medicineDAO.findById(id);
        medicine.setMedicineName("Test");
        medicineDAO.save(medicine);

        Medicine updatedMedicine = medicineDAO.findById(id);
        Assertions.assertThat(updatedMedicine.getMedicineName()).isEqualTo("Test");
    }

    @Test
    public void testGet(){
        Integer id = 4;
        Medicine medicine = medicineDAO.findById(id);
        Assertions.assertThat(medicine).isNotNull();
        logger.log(Level.WARNING, medicine.toString());
    }
}
