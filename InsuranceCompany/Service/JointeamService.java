package com.example.InsuranceCompany.Service;

import java.util.List;
import java.util.Optional;

import com.example.InsuranceCompany.Entity.Jointeam;

public interface JointeamService {
	
	List<Jointeam> findAll();
	Optional<Jointeam> findbyid(Long id);
	Jointeam save(Jointeam jointeam);
	Jointeam update(Jointeam jointeam);
	void delete(Long id);

}
