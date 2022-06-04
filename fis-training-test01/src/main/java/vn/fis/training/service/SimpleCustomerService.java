package vn.fis.training.service;

import vn.fis.training.domain.Customer;
import vn.fis.training.exception.CustomerNotFoundException;
import vn.fis.training.exception.InvalidCustomerException;
import vn.fis.training.store.InMemoryCustomerStore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SimpleCustomerService implements CustomerService{
    private InMemoryCustomerStore customerStore;
    private Customer customer;
    @Override
    public Customer findById(String id) throws vn.fis.training.exception.InvalidCustomerException{
        //TODO: Implement method tho dung dac ta cua CustomerService interface
        if(isNullOrEmpty(id)) throw new IllegalArgumentException("ko co ID");
        return customerStore.findAll()
                .stream()
                .filter(customer1 -> {
                    return id.equals(customer1.getId());
                })
                .findFirst()
                .orElseThrow(()->{
                    throw new CustomerNotFoundException("ko có id");
                });
    }
    private boolean isNullOrEmpty(String id){
        return id==null ? true : id.trim().length()==0 ? false : true;
    }
    @Override
    public Customer createCustomer(Customer customer) throws vn.fis.training.exception.InvalidCustomerException {
        //TODO: Implement method tho dung dac ta cua CustomerService interface

       customerStore.findAll().forEach(c->{
            if(c.getMobile().equals(customer.getMobile())) throw new vn.fis.training.exception.DuplicateCustomerException(customer,"tontai");
        });
        customerStore.insertOrUpdate(customer);
        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) throws vn.fis.training.exception.InvalidCustomerException {
        //TODO: Implement method tho dung dac ta cua CustomerService interface
        customerStore.findAll().forEach(customer1 -> {
            if(!customer1.getId().equals(customer.getId())) throw new vn.fis.training.exception.DuplicateCustomerException(customer,"ko ton tai");
        });
        customerStore.insertOrUpdate(customer);
        return customer;
    }

    @Override
    public void deleteCustomerById(String id) {
        //TODO: Implement method tho dung dac ta cua CustomerService interface
        if(isNullOrEmpty(id)) throw new IllegalArgumentException("ko co ID");
        findById(id);
        customerStore.deleteById(id);
    }

    @Override
    public List<Customer> findAllOrderByNameAsc() {
        //TODO: Implement method tho dung dac ta cua CustomerService interface
        return customerStore.findAll().stream().sorted(Comparator.comparing(Customer::getName)).collect(Collectors.toList());

    }

    @Override
    public List<Customer> findAllOrderByNameLimit(int limit) {
        //TODO: Implement method tho dung dac ta cua CustomerService interface

        return customerStore.findAll().stream().sorted(Comparator.comparing(Customer::getName)).limit(10).collect(Collectors.toList());
    }

    @Override
    public List<Customer> findAllCustomerByNameLikeOrderByNameAsc(String custName, String limit) {
        //TODO: Implement method tho dung dac ta cua CustomerService interface

        return customerStore.findAll().stream().sorted(Comparator.comparing(Customer::getName)).collect(Collectors.toList());
    }

    @Override
    public List<SummaryCustomerByAgeDTO> summaryCustomerByAgeOrderByAgeDesc() {
        //TODO: Implement method tho dung dac ta cua CustomerService interface
        return null;
    }


}
