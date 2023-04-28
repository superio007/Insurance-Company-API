package com.example.InsuranceCompany.Repository;

import org.springframework.stereotype.Repository;
import com.example.InsuranceCompany.Entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Long>{ 

}
