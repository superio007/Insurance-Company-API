package com.example.InsuranceCompany.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.InsuranceCompany.Entity.AppointmentEntity;
import com.example.InsuranceCompany.Repository.AppointmentRepository;
import com.example.InsuranceCompany.Service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	private final AppointmentRepository appoinmentRepository;

	public AppointmentServiceImpl(AppointmentRepository appoinmentRepository) {
		super();
		this.appoinmentRepository = appoinmentRepository;
	}

	@Override
	public List<AppointmentEntity> findAll() {
		return appoinmentRepository.findAll();
	}

	@Override
	public Optional<AppointmentEntity> findbyid(Long id) {
		return appoinmentRepository.findById(id);
	}

	@Override
	public AppointmentEntity saveAppointment(AppointmentEntity appointmentEntity) {
		return appoinmentRepository.save(appointmentEntity);
	}

	@Override
	public AppointmentEntity updateAppointment(AppointmentEntity appointmentEntity) {
		return appoinmentRepository.save(appointmentEntity);
	}

	@Override
	public void delete(Long id) {
		appoinmentRepository.deleteById(id);
		
	}
	
	

}
