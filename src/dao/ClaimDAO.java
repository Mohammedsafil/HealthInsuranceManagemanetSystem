package dao;

import java.sql.SQLException;
import java.util.List;

import model.Claims;

public interface ClaimDAO {
	void addClaim(Claims claim) throws SQLException;
    Claims getClaimById(int claimId) throws SQLException;
    List<Claims> getAllClaims() throws SQLException;
    void updateClaim(Claims claim) throws SQLException;
    void deleteClaim(int claimId) throws SQLException;
}
