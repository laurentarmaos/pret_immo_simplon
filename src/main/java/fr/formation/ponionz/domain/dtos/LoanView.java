package fr.formation.ponionz.domain.dtos;

import java.time.LocalDate;
import java.time.LocalTime;

public class LoanView {

    private int amount;

    private int contribution;

    private Integer duration;

    private double interestRate;

    private double insuranceRate;

    private boolean insuranceEmployment;

    private int socialInsurance;

    private LocalDate date;

    private LocalTime time;

    public LoanView() {

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

    public LocalDate getDate() {
	return date;
    }

    public void setDate(LocalDate date) {
	this.date = date;
    }

    public LocalTime getTime() {
	return time;
    }

    public void setTime(LocalTime time) {
	this.time = time;
    }

    @Override
    public String toString() {
	return "LoanView [amount=" + amount + ", contribution=" + contribution + ", duration=" + duration
		+ ", interestRate=" + interestRate + ", insuranceRate=" + insuranceRate + ", insuranceEmployment="
		+ insuranceEmployment + ", socialInsurance=" + socialInsurance + ", date=" + date + ", time=" + time
		+ "]";
    }

}
