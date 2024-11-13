package model;

import java.sql.Date;

public class Payment {
	private int paymentId;
	private CustomerPolicy customerPolicy;
	private Date paymentDate;
	private double amountPaid;
	private String status;
	
	public Payment(int paymentId, CustomerPolicy customerPolicy, Date paymentDate, double amountPaid, String status) {
		super();
		this.paymentId = paymentId;
		this.customerPolicy = customerPolicy;
		this.paymentDate = paymentDate;
		this.amountPaid = amountPaid;
		this.status = status;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public CustomerPolicy getCustomerPolicy() {
		return customerPolicy;
	}

	public void setCustomerPolicy(CustomerPolicy customerPolicy) {
		this.customerPolicy = customerPolicy;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
