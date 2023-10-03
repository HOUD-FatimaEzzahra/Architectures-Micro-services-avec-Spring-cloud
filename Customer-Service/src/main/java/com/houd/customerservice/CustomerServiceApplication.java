package com.houd.customerservice;

import com.houd.customerservice.entities.Customer;
import com.houd.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(new Customer(null,"Fatiza","fatiza@mail.com"));
			customerRepository.save(new Customer(null,"Hind","hind@mail.com"));
			customerRepository.save(new Customer(null,"Majda","majda@mail.com"));

			customerRepository.findAll().forEach(customer -> {
				System.out.println(customer.toString());
			});
		};
	}
}