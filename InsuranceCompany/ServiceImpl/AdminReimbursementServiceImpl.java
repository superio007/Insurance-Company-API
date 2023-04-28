package com.example.InsuranceCompany.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.InsuranceCompany.Entity.AdminReimbursementEntity;
import com.example.InsuranceCompany.Repository.AdminReimbursementRepository;
import com.example.InsuranceCompany.Service.AdminReimbursementService;


@Service
public class AdminReimbursementServiceImpl implements AdminReimbursementService {
	
	private final AdminReimbursementRepository adminreimbursementrepository;

	public AdminReimbursementServiceImpl( AdminReimbursementRepository adminreimbursementrepository) {
		super();
		this.adminreimbursementrepository = adminreimbursementrepository;
	}

	@Override
	public List<AdminReimbursementEntity> findalladminreimbursementclaims() {
		return adminreimbursementrepository.findAll();
	}

	@Override
	public Optional<AdminReimbursementEntity> findbyadminreimbursementclaimsid(Long id) {
		return adminreimbursementrepository.findById(id);
	}

	@Override
	public AdminReimbursementEntity saveadminreimbursementclaim(AdminReimbursementEntity adminReimbursementEntity) {
		return adminreimbursementrepository.save(adminReimbursementEntity);
	}

	@Override
	public AdminReimbursementEntity updateadminreimbursementclaim(AdminReimbursementEntity adminReimbursementEntity) {
		return adminreimbursementrepository.save(adminReimbursementEntity);
	}

	@Override
	public void deleteadminreimbursementclaim(Long id) {
		adminreimbursementrepository.deleteById(id);
		
	}
	
	

}

