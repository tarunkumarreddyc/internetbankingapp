package com.cg.iba.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

//@MappedSuperclass
@Entity
public class Account {
	@Id
	private long accountId;
	private double interestRate;
	private double balance;
	private LocalDate dateOfOpening;
	@OneToOne
	private Customer customer;
	@OneToMany
	private List<Nominee> nominees;
	@OneToMany
	private List<Beneficiary> beneficiaries;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accounId) {
		this.accountId = accounId;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}

	public void setDateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public List<Nominee> getNominees() {
		return nominees;
	}

	public void setNominees(List<Nominee> nominees) {
		this.nominees = nominees;
	}
	
	public List<Beneficiary> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(List<Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", interestRate=" + interestRate + ", balance=" + balance
				+ ", dateOfOpening=" + dateOfOpening + ", customer=" + customer + "]";
	}







	

}

