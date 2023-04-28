package com.example.InsuranceCompany.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.InsuranceCompany.Entity.Jointeam;
import com.example.InsuranceCompany.Repository.JointeamRepository;
import com.example.InsuranceCompany.Service.JointeamService;

@Service
public class JointeamServiceImpl implements JointeamService {
	
	private final JointeamRepository jointeamrepository;

	public JointeamServiceImpl(JointeamRepository jointeamrepository) {
		super();
		this.jointeamrepository = jointeamrepository;
	}

	@Override
	public List<Jointeam> findAll() {
		return jointeamrepository.findAll();
	}

	@Override
	public Optional<Jointeam> findbyid(Long id) {
		return jointeamrepository.findById(id);
	}

	@Override
	public Jointeam save(Jointeam jointeam) {
		return jointeamrepository.save(jointeam);
	}

	@Override
	public Jointeam update(Jointeam jointeam) {
		return jointeamrepository.save(jointeam);
	}

	@Override
	public void delete(Long id) {
		jointeamrepository.deleteById(id);
	}
	
	

}
