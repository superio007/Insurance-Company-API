package com.example.InsuranceCompany.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.InsuranceCompany.Entity.CashlessEntity;
import com.example.InsuranceCompany.Repository.CashlessRepository;
import com.example.InsuranceCompany.Service.CashlessService;

@Service
public class CashlessServiceImpl implements CashlessService{
	
	private final CashlessRepository cashlessRepository;

	public CashlessServiceImpl(CashlessRepository cashlessRepository) {
		super();
		this.cashlessRepository = cashlessRepository;
	}

	@Override
	public List<CashlessEntity> findAllCashlessclaims() {
		return cashlessRepository.findAll();	
	}

	@Override
	public Optional<CashlessEntity> findbyid(Long id) {
		return cashlessRepository.findById(id);
	}

	@Override
	public CashlessEntity saveCashlessclaim(CashlessEntity cashlessEntity) {
		return cashlessRepository.save(cashlessEntity);
	}

	@Override
	public CashlessEntity updateCashlessclaim(CashlessEntity cashlessEntity) {
		return cashlessRepository.save(cashlessEntity);
	}

	@Override
	public void deleteclaim(Long id) {
		cashlessRepository.deleteById(id);
		
	}

	@Override
	public long getCount() {
		long count = cashlessRepository.count();
		return count;
	}

}

