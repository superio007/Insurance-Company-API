package com.example.InsuranceCompany.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InsuranceCompany.Entity.AdminEntity;
import com.example.InsuranceCompany.Repository.AdminRepository;
import com.example.InsuranceCompany.Service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminrepository;

	public AdminServiceImpl(AdminRepository adminrepository) {
		super();
		this.adminrepository = adminrepository;
	}

	@Override
	public List<AdminEntity> findAll() {
		return adminrepository.findAll();
	}

	@Override
	public Optional<AdminEntity> findbyid(Long id) {
		return adminrepository.findById(id);
	}

	@Override
	public AdminEntity save(AdminEntity adminEntity) {
		return adminrepository.save(adminEntity);
	}

	@Override
	public AdminEntity update(AdminEntity adminEntity) {
		return adminrepository.save(adminEntity);
	}

	@Override
	public void delete(Long id) {
		adminrepository.deleteById(id);
		
	}
	

//	@Override
//	public boolean admin(AdminEntity adminentity) {
//		AdminEntity foundadmin = adminrepository.findByUsernameAndPassword(adminentity.getUsername(), adminentity.getPassword());
//		return foundadmin != null;
//	}
	
	

}

