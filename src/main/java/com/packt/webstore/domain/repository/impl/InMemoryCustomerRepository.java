package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
    private List<Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> getAllCustomers() {
        Customer jan = new Customer("C1", "Jan");
        Customer anna = new Customer("C2", "Anna");
        Customer michal = new Customer("C3", "Michal");
        customers.addAll(List.of(jan, anna, michal));
        return customers;
    }
}
