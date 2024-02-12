package com.karina.customer_transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository crepo;
	
	@Autowired
	PaymentRepository prepo;
	
	@RequestMapping("/save")
	@Transactional(rollbackOn=RuntimeException.class)//exception data not saved//(topic timeout and insufficient balance)
	public String save()
	{
		Customer c=new Customer();
		c.setCname("anisha");
		c.setCadd("london");
		
		Payment p=new Payment();
		p.setBankname("boi");
		p.setAmount("sixty thousand");
		
		prepo.save(p);
		if(90>0)
		{
			throw new ArithmeticException("thhis is my exception");
		}
		crepo.save(c);
		
		return "data saved";
	}
}
