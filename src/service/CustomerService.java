package service;

import java.sql.SQLException;

import dao.CustomerDAO;
import dao.CustomerDAOImp;
import exception.InvalidCustomerDetailsException;
import model.Customer;

public class CustomerService {
	private final CustomerDAO customerDAO;
	
	public CustomerService() {
		this.customerDAO =  new CustomerDAOImp();
	}
	
	public void createCustomer(Customer customer) throws SQLException, InvalidCustomerDetailsException
	{
		customerDAO.createCustomer(customer);
	}
	
	public void getCustomerById(int customerId) throws SQLException, InvalidCustomerDetailsException 
	{
		customerDAO.getCustomerByID(customerId);
	}
	
	public void updateCustomer(Customer customer) throws SQLException, InvalidCustomerDetailsException
	{
		customerDAO.updateCustomer(customer);
	}
	
	public void deleteCustomer(int customerId) throws SQLException, InvalidCustomerDetailsException 
	{
		customerDAO.deleteCustomer(customerId);
	}
	public void getAllCustomerDetails() throws SQLException 
	{
		customerDAO.getAllCustomerDetails();
	}
}
