package com.zohocrmapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp.entities.Billing;
import com.zohocrmapp.repository.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billingRepo;

	@Override
	public void saveBill(Billing bill) {
		billingRepo.save(bill);
	}

}
