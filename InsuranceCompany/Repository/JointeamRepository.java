package com.example.InsuranceCompany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.InsuranceCompany.Entity.Jointeam;

@Repository
public interface JointeamRepository extends JpaRepository<Jointeam, Long>{

}
