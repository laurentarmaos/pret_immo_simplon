package fr.formation.ponionz.services;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Service;

import fr.formation.ponionz.domain.dtos.LoanCreate;
import fr.formation.ponionz.domain.entities.Loan;
import fr.formation.ponionz.repositories.LoanRepository;

@Service
public class LoanServiceImpl implements LoanService {

    private final LoanRepository repo;

    public LoanServiceImpl(LoanRepository repo) {
	this.repo = repo;
    }

    @Override
    public void create(LoanCreate dto) {

	;

	Loan loan = new Loan();

	// DecimalFormat twoDForm = new DecimalFormat("###.##");

	// loan.setInterestRate(Double.valueOf(twoDForm.format((dto.getInterestRate()))));

	loan.setAmount(dto.getAmount());
	loan.setContribution(dto.getContribution());
	loan.setInsuranceEmployment(dto.isInsuranceEmployment());
	loan.setInsuranceRate(Math.round(100 * dto.getInsuranceRate()) / 100.00);
	loan.setInterestRate(Math.round(100 * dto.getInterestRate()) / 100.00);
	loan.setSocialInsurance(dto.getSocialInsurance());
	loan.setDuration(dto.getDuration());

	LocalDate date = LocalDate.now();

	LocalTime hour = LocalTime.now();

	loan.setDate(date);
	loan.setTime(hour);

	repo.save(loan);

    }

}
