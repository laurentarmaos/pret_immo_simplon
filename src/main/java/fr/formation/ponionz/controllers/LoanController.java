package fr.formation.ponionz.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.ponionz.domain.dtos.LoanCreate;
import fr.formation.ponionz.services.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {

    private final LoanService service;

    public LoanController(LoanService service) {
	this.service = service;
    }

    @PostMapping
    public void create(@Valid @RequestBody LoanCreate loan) {

	service.create(loan);
    }

//    @GetMapping("/{id}")
//    public LoanCreate getById(@PathVariable("id") Long id) {
//
//	LoanCreate loan = new LoanCreate();
//	loan.setAmount(100000);
//	loan.setContribution(10000);
//	loan.setDuration(2);
//	loan.setInsuranceEmployment(false);
//	loan.setInterestRate(0.2);
//
//	return loan;
//    }
}
