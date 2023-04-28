package com.example.InsuranceCompany.Service;

import java.util.List;
import java.util.Optional;

import com.example.InsuranceCompany.Entity.AppointmentEntity;

public interface AppointmentService {
	
	List<AppointmentEntity> findAll();
	Optional<AppointmentEntity> findbyid(Long id);
	AppointmentEntity saveAppointment(AppointmentEntity appointmentEntity);
	AppointmentEntity updateAppointment(AppointmentEntity appointmentEntity);
	void delete(Long id);

}
