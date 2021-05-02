package utils;

import dto.Customer;
import service.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import java.rmi.RemoteException;
import java.util.Locale;

public class MernisService implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        KPSPublicSoap publicSoap = new KPSPublicSoapProxy();
        boolean result = false;
        try {
            result = publicSoap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
                    customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());

        } catch (NumberFormatException | RemoteException e) {
            e.printStackTrace();
        }
        return result;
    }
}
