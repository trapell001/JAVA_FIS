package vn.fis.training.ordermanagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vn.fis.training.ordermanagement.domain.Customer;
import vn.fis.training.ordermanagement.service.CustomerService;

@RestController
public class CustomerController {
    private final CustomerService customerService;
    @Autowired
    public CustomerController  (CustomerService customerService ){
        this.customerService = customerService;
    }
    @PostMapping("Customer")
    public ResponseEntity<Void> save(@RequestBody Customer customer){
        customerService.createCustomer(customer);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
