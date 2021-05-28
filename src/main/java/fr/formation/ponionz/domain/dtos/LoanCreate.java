package fr.formation.ponionz.domain.dtos;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import fr.formation.ponionz.validation.ValidIfTrue;
import fr.formation.ponionz.validation.ValidRate;

@ValidRate
@ValidIfTrue
public class LoanCreate {

    @Positive
    @NotNull
    @Min(100000)
    @Max(600000)
    private int amount;

    @PositiveOrZero
    private int contribution;

    @NotNull
    @Min(2)
    @Max(30)
    private Integer duration;

    @Positive
    @NotNull
    private double interestRate;

    @PositiveOrZero
    private double insuranceRate;

    private boolean insuranceEmployment;

    private int socialInsurance;

    private LocalDate date;

    private LocalTime time;

    public LoanCreate() {

    }

    public int getAmount() {
	return amount;
    }

    public void setAmount(int amount) {
	this.amount = amount;
    }

    public int getContribution() {
	return contribution;
    }

    public void setContribution(int contribution) {
	this.contribution = contribution;
    }

    public Integer getDuration() {
	return duration;
    }

    public void setDuration(Integer duration) {
	this.duration = duration;
    }

    public double getInterestRate() {
	return interestRate;
    }

    public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
    }

    public double getInsuranceRate() {
	return insuranceRate;
    }

    public void setInsuranceRate(double insuranceRate) {
	this.insuranceRate = insuranceRate;
    }

    public boolean isInsuranceEmployment() {
	return insuranceEmployment;
    }

    public void setInsuranceEmployment(boolean insuranceEmployment) {
	this.insuranceEmployment = insuranceEmployment;
    }

    public int getSocialInsurance() {
	return socialInsurance;
    }

    public void setSocialInsurance(int socialInsurance) {
	this.socialInsurance = socialInsurance;
    }

    @Override
    public String toString() {
	return "LoanCreate [amount=" + amount + ", contribution=" + contribution + ", duration=" + duration
		+ ", interestRate=" + interestRate + ", insuranceRate=" + insuranceRate + ", insuranceEmployment="
		+ insuranceEmployment + ", socialInsurance=" + socialInsurance + "]";
    }

}
