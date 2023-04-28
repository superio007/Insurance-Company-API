package com.example.InsuranceCompany.Repository;

import org.springframework.stereotype.Repository;

import com.example.InsuranceCompany.Entity.ReimbursementEntity;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ReimbursementRepository extends JpaRepository<ReimbursementEntity, Long> {

}
