package com.company.loan.dto;

public class CreateLoanRequest {

	private String loanNumber;
	private Double amount;
	private Long customerId;

	public CreateLoanRequest(String loanNumber, Double amount, Long customerId) {
		this.loanNumber = loanNumber;
		this.amount = amount;
		this.customerId = customerId;
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

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
}