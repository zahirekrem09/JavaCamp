package service;

import dto.Customer;

public class StarbucksCustomerService extends  BaseCustomerService {
    CustomerCheckService checkService;
    //CustomerCheckService checkService = new CustomerCheckServiceImp();

    public StarbucksCustomerService(CustomerCheckService checkService) {
        this.checkService = checkService;
    }
    @Override
    public void save(Customer customer) throws Exception {
        if (checkService.checkIfRealPerson(customer)) {
            super.save(customer);
        }else throw new Exception("Not a valid person");

    }
}
