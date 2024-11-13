package model;

import java.sql.Date;

public class CustomerPolicy {
	private int customerPolicyId;
	private Customer customer;
	private Policy policy;
	private Date startDate;
	private Date endDate;
	private String status;
	
	public CustomerPolicy(int customerPolicyId, Customer customer, Policy policy, Date startDate, Date endDate,
			String status) {
		super();
		this.customerPolicyId = customerPolicyId;
		this.customer = customer;
		this.policy = policy;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}

	public int getCustomerPolicyId() {
		return customerPolicyId;
	}

	public void setCustomerPolicyId(int customerPolicyId) {
		this.customerPolicyId = customerPolicyId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
