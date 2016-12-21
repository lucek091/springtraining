package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	public HibernateCustomerRepositoryImpl() {
	System.out.println("In HibernateCustomerRepositoryImpl constructor");
	}

	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers=new ArrayList<>();
		
		Customer customer=new Customer();
		customer.setFirstName("Lukasz");
		customer.setLastName("Stempin");
		
		customers.add(customer);
		
		return customers;
		
	}

}
