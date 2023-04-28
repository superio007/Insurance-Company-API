package com.example.InsuranceCompany.Service;

import java.util.List;
import java.util.Optional;

import com.example.InsuranceCompany.Entity.AdminReimbursementEntity;


public interface AdminReimbursementService {
	
	List<AdminReimbursementEntity> findalladminreimbursementclaims();
	Optional<AdminReimbursementEntity> findbyadminreimbursementclaimsid(Long id);
	AdminReimbursementEntity saveadminreimbursementclaim(AdminReimbursementEntity adminReimbursementEntity);
	AdminReimbursementEntity updateadminreimbursementclaim(AdminReimbursementEntity adminReimbursementEntity);
	void deleteadminreimbursementclaim(Long id);

}
