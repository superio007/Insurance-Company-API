package com.example.InsuranceCompany.Service;

import java.util.List;
import java.util.Optional;

import com.example.InsuranceCompany.Entity.CashlessEntity;

public interface CashlessService {
	
	List<CashlessEntity> findAllCashlessclaims();
	Optional<CashlessEntity> findbyid(Long id);
	CashlessEntity saveCashlessclaim(CashlessEntity cashlessEntity);
	CashlessEntity updateCashlessclaim(CashlessEntity cashlessEntity);
	void deleteclaim(Long id);
	
	public long getCount();

}
