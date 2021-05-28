package fr.formation.ponionz.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.ponionz.domain.dtos.LoanCreate;

public class ValidIfTrueValidator implements ConstraintValidator<ValidIfTrue, LoanCreate> {

    @Override
    public boolean isValid(LoanCreate value, ConstraintValidatorContext context) {

	if (value.isInsuranceEmployment() == true) {
	    // return !(value.getSocialInsurance() == 0);

	    return (value.getSocialInsurance() == 30 || value.getSocialInsurance() == 40
		    || value.getSocialInsurance() == 50 || value.getSocialInsurance() == 60
		    || value.getSocialInsurance() == 70);
	}

	return true;
    }

}
