package com.whebsys.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.whebsys.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment (Long workerId, int days) {
		return new Payment("TestName", 1500.00, days);
	}
}
