package com.example.InsuranceCompany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.InsuranceCompany.Entity.AdminReimbursementEntity;

@Repository
public interface AdminReimbursementRepository extends JpaRepository<AdminReimbursementEntity, Long>{

}
