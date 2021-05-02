import dto.Customer;
import service.BaseCustomerService;
import service.NeroCustomerService;
import service.StarbucksCustomerService;
import utils.MernisService;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
	Customer customer = new Customer(1, "Ekrem", "SARI",new Date(1992,3,1), "27250054522");
        BaseCustomerService customerService = new StarbucksCustomerService(new MernisService());
        //BaseCustomerService customerService2 = new NeroCustomerService();

    customerService.save(customer);
    }
}
