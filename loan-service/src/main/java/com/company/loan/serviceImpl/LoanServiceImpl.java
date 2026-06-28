package com.company.loan.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.loan.dto.CreateLoanRequest;
import com.company.loan.entity.Loan;
import com.company.loan.entity.LoanStatus;
import com.company.loan.repository.LoanRepository;
import com.company.loan.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService {

	private final LoanRepository repository;

	public LoanServiceImpl(LoanRepository repository) {
		this.repository = repository;
	}

	@Override
	public Loan createLoan(CreateLoanRequest request) {
		Loan loan = new Loan();
		loan.setLoanNumber(request.getLoanNumber());
		loan.setAmount(request.getAmount());
		loan.setBalance(request.getAmount());
		loan.setCustomerId(request.getCustomerId());
		loan.setStatus(LoanStatus.PENDING);
		return repository.save(loan);
	}

	@Override
	public List<Loan> getLoanDetails(Long customerId) {
		return repository.findByCustomerId(customerId);
	}

	@Override
	public Loan approve(Long id) {
		Loan loan = repository.findById(id).orElseThrow();
		loan.setStatus(LoanStatus.APPROVED);
		return repository.save(loan);
	}

	@Override
	public Loan reject(Long id) {
		Loan loan = repository.findById(id).orElseThrow();
		loan.setStatus(LoanStatus.REJECTED);
		return repository.save(loan);
	}

	@Override
	public List<Loan> getAllLoans() {
		return repository.findAll();
	}
}