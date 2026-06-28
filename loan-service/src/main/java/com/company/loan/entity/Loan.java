package com.company.loan.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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

	private String loanNumber;

	private Double amount;

	private Double balance;

	private Long customerId;

	@Enumerated(EnumType.STRING)
	private LoanStatus status;

	public Loan() {
	}

	public Loan(String loanNumber, Double amount, Double balance, Long customerId, LoanStatus status) {

		this.loanNumber = loanNumber;
		this.amount = amount;
		this.balance = balance;
		this.customerId = customerId;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public String getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public LoanStatus getStatus() {
		return status;
	}

	public void setStatus(LoanStatus status) {
		this.status = status;
	}
}