package vn.fis.training;


import vn.fis.training.domain.Customer;
import vn.fis.training.domain.CustomerStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CustomerManagementApplication
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Fis Java Training Course!" );
    }
    // TODO: Implement method to test all CustomerService
    Customer customer = new Customer("1","1",LocalDate.now(),"a", CustomerStatus.ACTIVE, LocalDateTime.now());
}
