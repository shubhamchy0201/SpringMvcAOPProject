package springproject.DAO;

import springproject.entity.Customer;
import java.util.List;


public interface CustomerDAO {

	public List<Customer> getCustomers();

    void saveCustomer(Customer theCustomer);

    Customer getCustomer(int theId);

    void deleteCustomer(int theId);
}
