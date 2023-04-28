package com.example.InsuranceCompany.Service;

import java.util.List;
import java.util.Optional;

import com.example.InsuranceCompany.Entity.AdminEntity;

public interface AdminService {
	
	List<AdminEntity> findAll();
	Optional<AdminEntity> findbyid(Long id);
	AdminEntity save(AdminEntity adminEntity);
	AdminEntity update(AdminEntity adminEntity);
	void delete(Long id);

}
