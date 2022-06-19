package vn.fis.training.ordermanagement.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vn.fis.training.ordermanagement.domain.Customer;
import vn.fis.training.ordermanagement.service.CustomerService;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CustomerServiceImplTest {

    @Autowired
    CustomerService customerService;
    @Test
    void createCustomer() {
        Customer customer = new Customer();
        customerService.createCustomer(customer);
    }

    @Test
    void updateCustomer() {
        Customer customer = new Customer();
        customer.setId(1l);
        customer.setName("khanh");
        customer.setAddress("abc");
        customer.setMobile("1");
        customerService.updateCustomer(customer);
    }

    @Test
    void deleteCustomerById() {
        customerService.deleteCustomerById(1l);
    }

}