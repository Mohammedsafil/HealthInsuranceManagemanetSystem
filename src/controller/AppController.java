package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import exception.InvalidCustomerDetailsException;
import model.Customer;
import service.CustomerService;
import service.PolicyService;

public class AppController {
	private final CustomerService customerService;
	private final BufferedReader br;
	private final PolicyService policyService;
	public AppController() {
		this.customerService = new CustomerService();
		this.br = new BufferedReader(new InputStreamReader(System.in));
		this.policyService = new PolicyService();
	}
	
	public void start() throws NumberFormatException, IOException, SQLException, InvalidCustomerDetailsException
	{
		int choice;
		do {
			displayMenu();
			choice = Integer.parseInt(br.readLine());
			
			switch(choice) {
			case 1:
				createCustomer();
				break;
			case 2:
				getCustomerById();
				break;
			case 3:
				updateCustomer();
				break;
			case 4:
				deleteCustomer();
				break;
			case 5:
				getAllCustomerDetails();
				break;
			case 6:
				showPolicies();
				break;
			case 0:
				System.out.println("Exiting application \n  Thankyou... :)");
				System.exit(0);
			}
		}while(true);
	}
	
	public void displayMenu() {
	    System.out.println("*************************************************");
	    System.out.println("*                                               *");
	    System.out.println("*      Welcome to Health Insurance Management   *");
	    System.out.println("*                 System                        *");
	    System.out.println("*                                               *");
	    System.out.println("*************************************************");
	    System.out.println("           [ MENU OPTIONS ]                      ");
	    System.out.println("-------------------------------------------------");
	    System.out.println("|  1. Create Account                            |");
	    System.out.println("|  2. Get Customer Details                      |");
	    System.out.println("|  3. Update Customer Details                   |");
	    System.out.println("|  4. Delete Customer Details                   |");
	    System.out.println("|  5. Get All Customers' Details                |");
	    System.out.println("|  6. View Policies                             |");
	    System.out.println("|  0. Exit                                      |");
	    System.out.println("-------------------------------------------------");
	    System.out.println("        Please enter your choice:               ");
	}


	
	
	public void createCustomer() throws IOException, SQLException, InvalidCustomerDetailsException {
		System.out.println("Enter customer details");
		System.out.println("Enter the cutomer name: ");
		String customerName = br.readLine();
		
		System.out.println("Enter the customer phone number: ");
		String phone = br.readLine();
		
		System.out.println("Enter the cutomer DOB in format yyyy-mm-dd: ");
		String DOB = br.readLine();
		
		System.out.println("Enter gender: ");
		String gender = br.readLine();
		
		customerService.createCustomer(new Customer(0,customerName,phone,DOB,gender));
	}
	
	public void getCustomerById() throws NumberFormatException, IOException, SQLException {
		System.out.println("Enter customer Id: ");
		int customerId = Integer.parseInt(br.readLine());
		
		try {
			customerService.getCustomerById(customerId);
		} catch (SQLException | InvalidCustomerDetailsException e) {
			e.printStackTrace();
			System.out.println("Enter a valid customer Id");
		}
	}
	
	public void updateCustomer() throws IOException {
		System.out.println("Enter the details to be update: ");
		System.out.println("Enter the customer Id to update the details: ");
		int customerId = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the cutomer name: ");
		String customerName = br.readLine();
		
		System.out.println("Enter the customer phone number: ");
		String phone = br.readLine();
		
		System.out.println("Enter the cutomer DOB in format yyyy-mm-dd: ");
		String DOB = br.readLine();
		
		System.out.println("Enter gender: ");
		String gender = br.readLine();
		
		try {
			customerService.updateCustomer(new Customer(customerId,customerName,phone,DOB,gender));
		} catch (SQLException | InvalidCustomerDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Enter a valid customer id to be updated\n");
		}
	}
	
	public void deleteCustomer() throws NumberFormatException, IOException {
		System.out.println("Enter the customer Id to be deleted: ");
		int customerId = Integer.parseInt(br.readLine());
		
		try {
			customerService.deleteCustomer(customerId);
		} catch (SQLException | InvalidCustomerDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Enter a valid customer Id to be deleted...\n");
		}
	}
	
	public void getAllCustomerDetails() throws SQLException {
		customerService.getAllCustomerDetails();
	}
	
	public void showPolicies() throws SQLException {
		policyService.showPolicies();
	}
}
