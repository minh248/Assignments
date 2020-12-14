package com.vti.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeValidator implements ConstraintValidator<Age, LocalDate> {
    private int minAge;

    @Override
    public void initialize(Age age) {
        minAge = age.min();
    }

    @Override
    public boolean isValid(LocalDate birthDay, ConstraintValidatorContext constraintValidatorContext) {
        if (birthDay == null){
            return false;
        }

        return ChronoUnit.YEARS.between(birthDay, LocalDate.now())  > minAge;
    }
}
