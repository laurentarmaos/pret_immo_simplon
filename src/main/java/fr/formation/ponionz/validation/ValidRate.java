package fr.formation.ponionz.validation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(TYPE)
@Constraint(validatedBy = { ValidRateValidator.class })
public @interface ValidRate {

    String message() default "max. 50% du montant emprunté";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
