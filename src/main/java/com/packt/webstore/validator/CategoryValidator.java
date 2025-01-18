package com.packt.webstore.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class CategoryValidator implements ConstraintValidator<Category, String> {
    private List<String> allowedCategories;

    @Override
    public void initialize(Category constraintAnnotation) {
        allowedCategories = List.of("tablet", "smart phone", "laptop", "monitor");
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return allowedCategories.contains(value.toLowerCase());
    }
}
