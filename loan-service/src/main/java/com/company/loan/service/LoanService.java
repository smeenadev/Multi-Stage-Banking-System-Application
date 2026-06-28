package com.company.loan.service;

import java.util.List;

import com.company.loan.dto.CreateLoanRequest;
import com.company.loan.entity.Loan;


public interface LoanService {

	public Loan createLoan(CreateLoanRequest request);

	public List<Loan> getLoanDetails(Long customerId);

	public Loan approve(Long id);

	public Loan reject(Long id);

	public List<Loan> getAllLoans();

}
