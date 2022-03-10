package perscholas;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import perscholas.database.dao.MedicineDAO;
import perscholas.database.dao.UserDAO;
import perscholas.database.entities.Medicine;
import perscholas.database.entities.User;

import java.util.logging.Level;
import java.util.logging.Logger;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserDAOTest {

    @Autowired
    private UserDAO userDAO;

    Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    @Test
    public void testAddNew(){

        User user = new User();
        user.setFirstName("Test");
        user.setLastName("Test");
        user.setEmail("Test");
        user.setUsername("Test");
        user.setPassword("Test");
        userDAO.save(user);

        Assertions.assertThat(user).isNotNull();
        Assertions.assertThat(user.getId()).isGreaterThan(0);
    }

    @Test
    public void testListAll(){
        Iterable<User> users = userDAO.findAll();
        Assertions.assertThat(users).hasSizeGreaterThan(0);
        users.forEach(user -> logger.log(Level.WARNING, user.toString()));
    }

    @Test
    public void testUpdate(){
        Integer id = 4;
        User user = userDAO.findById(id);
        user.setUsername("Test");
        userDAO.save(user);

        User updatedUser = userDAO.findById(id);
        Assertions.assertThat(updatedUser.getUsername()).isEqualTo("Test");
    }

    @Test
    public void testGet(){
        Integer id = 3;
        User user = userDAO.findById(id);
        Assertions.assertThat(user).isNotNull();
        logger.log(Level.WARNING, user.toString());
    }
}
