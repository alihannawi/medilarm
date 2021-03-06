package perscholas.validation;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import perscholas.database.entities.User;
import perscholas.database.dao.UserDAO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class EmailUniqueImpl implements ConstraintValidator<EmailUnique, String> {

    public static final Logger LOG = LoggerFactory.getLogger(EmailUniqueImpl.class);

    @Autowired
    private UserDAO userDao;


    @Override
    public void initialize(EmailUnique constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // a custom validation should validate 1 and only 1 thing.
        // since a check for not null or not empty already exists
        // we want this function to return true in that case which will
        // prevent the error message for this validation from displaying
        // when the incoming value is null or empty.
        // this is a good design pattern and should be implemented as the first
        // thing in all custom validations.
        if ( StringUtils.isEmpty(value) ) {
            return true;
        }

        // if the user obect returned by this query is null then the test is a pass and you can return true;
        User user = userDao.findByUsername(value);

        return ( user == null );
    }

}
