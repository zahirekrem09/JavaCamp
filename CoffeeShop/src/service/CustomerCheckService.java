package service;

import dto.Customer;

public interface CustomerCheckService {

    boolean checkIfRealPerson(Customer customer);
}
