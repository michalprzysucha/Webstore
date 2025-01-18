package com.packt.webstore.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target( { METHOD, FIELD, ANNOTATION_TYPE } )
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ProductIdValidator.class)
@Documented
public @interface ProductId {
    String message() default "{com.packt.webstore.validator.ProductId.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
