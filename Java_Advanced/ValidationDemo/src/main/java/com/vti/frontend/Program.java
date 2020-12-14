package com.vti.frontend;

import com.vti.entity.User;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.time.LocalDate;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        User user = new User();
        user.setBirthDay(LocalDate.of(2020, 8, 24));

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();

        Set<ConstraintViolation<User>> violations = validator.validate(user);

        for (ConstraintViolation<User> violation : violations){
            System.out.println(violation.getMessage());
        }
    }
}
