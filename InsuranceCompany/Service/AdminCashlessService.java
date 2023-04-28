package com.example.InsuranceCompany.Service;

import java.util.List;
import java.util.Optional;

import com.example.InsuranceCompany.Entity.AdminCashlessEntity;


public interface AdminCashlessService {
	
	List<AdminCashlessEntity> findalladmincashlessclaims();
	Optional<AdminCashlessEntity> findbyadmincashlessclaimsid(Long id);
	AdminCashlessEntity saveadmincashlessclaim(AdminCashlessEntity admincashlessentity);
	AdminCashlessEntity updateadmincashlessclaim(AdminCashlessEntity admincashlessentity);
	void deleteadmincashlessclaim(Long id);

}
