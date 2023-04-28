package com.example.InsuranceCompany.Repository;

import org.springframework.stereotype.Repository;
import com.example.InsuranceCompany.Entity.CashlessEntity;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CashlessRepository extends JpaRepository<CashlessEntity, Long> {

}
