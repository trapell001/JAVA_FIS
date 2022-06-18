package vn.fis.training.ordermanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Service;
import vn.fis.training.ordermanagement.domain.Customer;
import vn.fis.training.ordermanagement.repository.CustomerRepository;
import vn.fis.training.ordermanagement.service.CustomerService;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
//        customerRepository.findAll().forEach(customer1 -> {
//            if(!customer1.getId().equals(customer.getId()))
//                throw new NoSuchMessageException("ko tim thay custommer");});
        Optional<Customer> customer1 = customerRepository.findById(customer.getId());
        return customerRepository.save(customer1.get()) ;
    }

    @Override
    public void deleteCustomerById(Long customerId) {
        Optional<Customer> customer = customerRepository.findById(customerId);
        customerRepository.delete(customer.get());
    }
}
