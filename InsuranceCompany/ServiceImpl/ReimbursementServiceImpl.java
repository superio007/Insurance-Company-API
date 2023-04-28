package com.example.InsuranceCompany.ServiceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.InsuranceCompany.Entity.ReimbursementEntity;
import com.example.InsuranceCompany.Repository.ReimbursementRepository;
import com.example.InsuranceCompany.Service.ReimbursementService;

@Service
public class ReimbursementServiceImpl implements ReimbursementService{
	
	private final ReimbursementRepository reimbursementRepository;

	public ReimbursementServiceImpl(ReimbursementRepository reimbursementRepository) {
		super();
		this.reimbursementRepository = reimbursementRepository;
	}

	@Override
	public List<ReimbursementEntity> findall() {
		return reimbursementRepository.findAll();
	}

	@Override
	public Optional<ReimbursementEntity> findbyid(Long id) {
		return reimbursementRepository.findById(id);
	}

	@Override
	public ReimbursementEntity saveclaim(ReimbursementEntity reimbursementEntity) {
		return reimbursementRepository.save(reimbursementEntity);
	}

	@Override
	public ReimbursementEntity updateclaim(ReimbursementEntity reimbursementEntity) {
		return reimbursementRepository.save(reimbursementEntity);
	}

	@Override
	public void deleteclaim(Long id) {
		reimbursementRepository.deleteById(id);
	}

}

