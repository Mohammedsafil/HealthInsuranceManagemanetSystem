package model;

public class Policy {
	private int policyId;
	private String policyName;
	private String description;
	private double premiumAmount;
	private double coverageAmount;
	
	public Policy(int policyId, String policyName, String description, double premiumAmount, double coverageAmount) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.description = description;
		this.premiumAmount = premiumAmount;
		this.coverageAmount = coverageAmount;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public double getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(double coverageAmount) {
		this.coverageAmount = coverageAmount;
	}
	
	
	
}
