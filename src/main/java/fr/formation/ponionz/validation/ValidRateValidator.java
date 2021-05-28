package fr.formation.ponionz.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.ponionz.domain.dtos.LoanCreate;

public class ValidRateValidator implements ConstraintValidator<ValidRate, LoanCreate> {

    @Override
    public boolean isValid(LoanCreate value, ConstraintValidatorContext context) {

	return value.getContribution() <= (value.getAmount() * 0.5);
    }

}
