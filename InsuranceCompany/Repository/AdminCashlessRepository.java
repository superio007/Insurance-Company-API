package com.example.InsuranceCompany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.InsuranceCompany.Entity.AdminCashlessEntity;

@Repository
public interface AdminCashlessRepository extends JpaRepository<AdminCashlessEntity, Long> {

}
