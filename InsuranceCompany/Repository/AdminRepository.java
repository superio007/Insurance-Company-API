package com.example.InsuranceCompany.Repository;

import org.springframework.stereotype.Repository;
import com.example.InsuranceCompany.Entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Long> {

}
