package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utility.DBConnection;

public class PolicyDAOImp implements PolicyDAO{

	@Override
	public void showPolicies() throws SQLException {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM policies";
		
		try(Connection con = DBConnection.getConnection();
				Statement st = con.createStatement();)
			{
					ResultSet rs = st.executeQuery(query);
					
					while(rs.next()) {
						System.out.println("\nPolicy Id: "+rs.getInt("policy_id"));
						System.out.println("Policy name: "+rs.getString("policy_name"));
						System.out.println("Policy description: "+rs.getString("description"));
						System.out.println("Premium Amount: "+rs.getDouble("premium_amount"));
						System.out.println("Coverage Amount: "+rs.getDouble("coverage_amount")+"\n");
					}
			}
	}
	
}
