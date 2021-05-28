package fr.formation.ponionz.validation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(TYPE)
@Constraint(validatedBy = { ValidIfTrueValidator.class })
public @interface ValidIfTrue {

    String message() default "valeur requise";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
