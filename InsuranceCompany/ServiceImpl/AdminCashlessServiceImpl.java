package com.example.InsuranceCompany.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.InsuranceCompany.Entity.AdminCashlessEntity;
import com.example.InsuranceCompany.Repository.AdminCashlessRepository;
import com.example.InsuranceCompany.Service.AdminCashlessService;

@Service
public class AdminCashlessServiceImpl implements AdminCashlessService {
	
	private final AdminCashlessRepository admincashlessrepository;

	public AdminCashlessServiceImpl(AdminCashlessRepository admincashlessrepository) {
		super();
		this.admincashlessrepository = admincashlessrepository;
	}

	@Override
	public List<AdminCashlessEntity> findalladmincashlessclaims() {
		return admincashlessrepository.findAll();
	}

	@Override
	public Optional<AdminCashlessEntity> findbyadmincashlessclaimsid(Long id) {
		return admincashlessrepository.findById(id);
	}

	@Override
	public AdminCashlessEntity saveadmincashlessclaim(AdminCashlessEntity admincashlessentity) {
		return admincashlessrepository.save(admincashlessentity);
	}

	@Override
	public AdminCashlessEntity updateadmincashlessclaim(AdminCashlessEntity admincashlessentity) {
		return admincashlessrepository.save(admincashlessentity);
	}

	@Override
	public void deleteadmincashlessclaim(Long id) {
		admincashlessrepository.deleteById(id);
		
	}
	
	

}
