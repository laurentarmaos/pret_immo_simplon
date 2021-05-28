package fr.formation.ponionz.domain.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private int amount;

    @Column(name = "contribution")
    private int contribution;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "interestRate")
    private double interestRate;

    @Column(name = "insuranceRate")
    private double insuranceRate;

    @Column(name = "insuranceEmployment")
    private boolean insuranceEmployment;

    @Column(name = "socialInsurance")
    private int socialInsurance;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "hour")
    private LocalTime time;

    public Loan() {

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
	return "Loan [amount=" + amount + ", contribution=" + contribution + ", duration=" + duration
		+ ", interestRate=" + interestRate + ", insuranceRate=" + insuranceRate + ", insuranceEmployment="
		+ insuranceEmployment + ", socialInsurance=" + socialInsurance + ", date=" + date + ", time=" + time
		+ "]";
    }

}
