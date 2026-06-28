package com.company.loan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.loan.entity.Loan;
import com.company.loan.entity.LoanStatus;

public interface LoanRepository extends JpaRepository<Loan, Long> {

	List<Loan> findByCustomerId(Long customerId);

	List<Loan> findByStatus(LoanStatus status);
}