package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import exception.InvalidCustomerDetailsException;
import model.Customer;
import utility.DBConnection;

public class CustomerDAOImp implements CustomerDAO{

	@Override
	public void createCustomer(Customer customer) throws SQLException, InvalidCustomerDetailsException {
		// TODO Auto-generated method stub
		String query = "INSERT INTO customer(customer_name,phone,date_of_birth,gender) values(?,?,?,?)";
		
		try(Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(query);)
		{
			ps.setString(1, customer.getCustomerName());
			ps.setString(2, customer.getPhone());
			ps.setString(3, customer.getDateOfBirth());
			ps.setString(4,customer.getGender());
			
			int result = ps.executeUpdate();
			
			if(result==0) {
				throw new InvalidCustomerDetailsException("The given customer details are not valid...!");
			}
			else {
				System.out.println("Customer created Successfully\n");
			}
		}
		
	}

	@Override
	public void getCustomerByID(int customerID) throws SQLException, InvalidCustomerDetailsException {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM customer WHERE customer_id = ?";
		
		try(Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(query);){
			ps.setInt(1, customerID);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("\nCustomer Id: "+customerID);
				System.out.println("Customer name: "+rs.getString("customer_name"));
				System.out.println("Customer Phone: "+rs.getString("phone"));
				System.out.println("Customer DOB: "+rs.getString("date_of_birth"));
				System.out.println("Gender: "+rs.getString("gender"));
				System.out.println("Registration Date: "+rs.getDate("registration_date")+"\n");
			}
			else {
				throw new InvalidCustomerDetailsException("Customer Id is not valid");
			}
		}
		
	}

	@Override
	public void updateCustomer(Customer customer) throws SQLException, InvalidCustomerDetailsException {
		// TODO Auto-generated method stub
		String query = "UPDATE customer set customer_name = ?, phone = ?, date_of_birth = ?, gender= ? WHERE customer_id = ?";
		
		try(Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(query);)
		{
			ps.setString(1,customer.getCustomerName());
			ps.setString(2, customer.getPhone());
			ps.setString(3, customer.getDateOfBirth());
			ps.setString(4, customer.getGender());
			ps.setInt(5, customer.getCustomerID());
			
			int result = ps.executeUpdate();
			
			if(result==0) {
				throw new InvalidCustomerDetailsException("Customer id is not valid...\n");
			}
			else {
				System.out.println("Updated successfully\n");
			}
		}
		
	}

	@Override
	public void deleteCustomer(int customerId) throws SQLException, InvalidCustomerDetailsException {
		// TODO Auto-generated method stub
		String query = "DELETE FROM customer WHERE customer_id = ?";
		try(Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(query);)
		{
			ps.setInt(1, customerId);
			
			int result = ps.executeUpdate();
			
			if(result==0) {
				throw new InvalidCustomerDetailsException("Customer id is not valid...\n");
			}
			else {
				System.out.println("Deleted successfully\n");
			}
		}
		
	}
	
	@Override
	public void getAllCustomerDetails() throws SQLException {
		String query = "SELECT * FROM customer";
		
		try(Connection con = DBConnection.getConnection();
				Statement st = con.createStatement();)
		{
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("\nCustomer id: "+rs.getInt("customer_id"));
				System.out.println("Customer name: "+rs.getString("customer_name"));
				System.out.println("Customer DOB: "+rs.getString("date_of_birth"));
				System.out.println("Customer Phone: "+rs.getString("phone"));
				System.out.println("Customer Gender: "+rs.getString("gender"));
				System.out.println("Customer Registered Date: "+rs.getDate("registration_date")+"\n");
			}
		}
	}

}
