package model;

import java.sql.Date;

public class Claims {
	private int claimId;
	private CustomerPolicy customerPolicy;
	private Date claimDate;
	private double claimAmount;
	private Date approvalDate;
	private String status;
	
	public Claims(int claimId, CustomerPolicy customerPolicy, Date claimDate, double claimAmount, Date approvalDate,
			String status) {
		super();
		this.claimId = claimId;
		this.customerPolicy = customerPolicy;
		this.claimDate = claimDate;
		this.claimAmount = claimAmount;
		this.approvalDate = approvalDate;
		this.status = status;
	}

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public CustomerPolicy getCustomerPolicy() {
		return customerPolicy;
	}

	public void setCustomerPolicy(CustomerPolicy customerPolicy) {
		this.customerPolicy = customerPolicy;
	}

	public Date getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(Date claimDate) {
		this.claimDate = claimDate;
	}

	public double getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(double claimAmount) {
		this.claimAmount = claimAmount;
	}

	public Date getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
