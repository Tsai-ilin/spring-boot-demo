package com.example.validatordemo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyCustomConstraintValidator implements ConstraintValidator<MyCustomConstraint,String> {
    @Override
    public void initialize(MyCustomConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.equals("BeiJing") || s.equals("ShangHai");
    }
}
