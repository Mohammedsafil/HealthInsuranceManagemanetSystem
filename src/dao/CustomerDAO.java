package dao;

import java.sql.SQLException;

import exception.InvalidCustomerDetailsException;
import model.Customer;

public interface CustomerDAO {
	void createCustomer(Customer customer)throws SQLException ,InvalidCustomerDetailsException;
	void getCustomerByID(int customerID)throws SQLException, InvalidCustomerDetailsException;
	void updateCustomer(Customer customer)throws SQLException, InvalidCustomerDetailsException;
	void deleteCustomer(int customerId)throws SQLException, InvalidCustomerDetailsException;
	void getAllCustomerDetails()throws SQLException;
}
