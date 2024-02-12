package com.karina.customer_transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableTransactionManagement
@SpringBootApplication
public class CustomerTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerTransactionApplication.class, args);
	}

}
