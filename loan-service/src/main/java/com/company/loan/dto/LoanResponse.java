package com.company.loan.dto;

import com.company.loan.entity.LoanStatus;

public class LoanResponse {

	private Long id;
	private String loanNumber;
	private Double amount;
	private Double balance;
	private LoanStatus status;

	public LoanResponse(Long id, String loanNumber, Double amount, Double balance, LoanStatus status) {
		this.id = id;
		this.loanNumber = loanNumber;
		this.amount = amount;
		this.balance = balance;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public String getLoanNumber() {
		return loanNumber;
	}

	public Double getAmount() {
		return amount;
	}

	public Double getBalance() {
		return balance;
	}

	public LoanStatus getStatus() {
		return status;
	}
}