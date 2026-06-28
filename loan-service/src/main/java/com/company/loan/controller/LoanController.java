package com.company.loan.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.loan.dto.CreateLoanRequest;
import com.company.loan.entity.Loan;
import com.company.loan.service.LoanService;

@RestController
@RequestMapping("/loan-service")
public class LoanController {

	private LoanService service;

	public LoanController(LoanService service) {
		this.service = service;
	}

	@PostMapping("/create/loan")
	public Loan createLoan(@RequestBody CreateLoanRequest request) {
		return service.createLoan(request);
	}

	@GetMapping("/customer-id")
	public List<Loan> customerLoans(@RequestParam Long customerId) {
		return service.getLoanDetails(customerId);
	}

	@PutMapping("/customer-id/approve")
	public Loan approve(@RequestParam Long id) {
		return service.approve(id);
	}

	@PutMapping("/customer-id/reject")
	public Loan reject(@RequestParam Long id) {
		return service.reject(id);
	}

	@GetMapping("/getAllLoans")
	public List<Loan> allLoans() {
		return service.getAllLoans();
	}
}