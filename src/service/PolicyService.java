package service;

import java.sql.SQLException;

import dao.PolicyDAO;
import dao.PolicyDAOImp;

public class PolicyService {
	private final PolicyDAO policyDAO;
	public PolicyService() {
		this.policyDAO = new PolicyDAOImp();
	}
	
	public void showPolicies() throws SQLException
	{
		policyDAO.showPolicies();
	}
}
