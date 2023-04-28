package com.example.InsuranceCompany.Service;

import java.util.List;
import java.util.Optional;

import com.example.InsuranceCompany.Entity.ReimbursementEntity;

public interface ReimbursementService {
	
	List<ReimbursementEntity> findall();
	Optional<ReimbursementEntity> findbyid(Long id);
	ReimbursementEntity saveclaim(ReimbursementEntity ReimbursementEntity);
	ReimbursementEntity updateclaim(ReimbursementEntity ReimbursementEntity);
	void deleteclaim(Long id);
	

}
