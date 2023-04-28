package com.example.InsuranceCompany.Repository;

import org.springframework.stereotype.Repository;
import com.example.InsuranceCompany.Entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Long> {

}
