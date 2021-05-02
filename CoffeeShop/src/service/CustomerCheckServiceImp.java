package service;

import dto.Customer;

public class CustomerCheckServiceImp implements  CustomerCheckService{


    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
