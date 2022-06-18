package vn.fis.training.ordermanagement.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import vn.fis.training.ordermanagement.domain.Customer;
import vn.fis.training.ordermanagement.service.CustomerService;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImplTest {

    @Autowired
    CustomerService customerService;
    @Test
    void createCustomer() {
        Customer customer = new Customer();
        customer.setAddress("Ninh Bình");
        customer.setMobile("0936271124");
        customer.setName("Đỗ Hải Phong");
        customerService.createCustomer(customer);
    }

    @Test
    void updateCustomer() {
    }

    @Test
    void deleteCustomerById() {
    }
}