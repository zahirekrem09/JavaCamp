package service;

import dto.Customer;

public abstract class BaseCustomerService implements  CustomerService{
    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Save to db " + customer.getFirstName());

    }
}
