package com.example.InsuranceCompany.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.InsuranceCompany.Entity.AppointmentEntity;
import com.example.InsuranceCompany.Service.AppointmentService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/appointment")
public class AppoinmentController {
	
	private final AppointmentService appointmentService;

	public AppoinmentController(AppointmentService appointmentService) {
		super();
		this.appointmentService = appointmentService;
	}
	
	@GetMapping
	public List<AppointmentEntity> findallappoinments(){
		return appointmentService.findAll();
	}

	@GetMapping("/{id}")
	public Optional<AppointmentEntity> findclaimbyid(@PathVariable("id") Long id){
		return appointmentService.findbyid(id);
	}
	
	@PostMapping
	public AppointmentEntity saveappoinments(@RequestBody AppointmentEntity appointmentEntity) {
		return appointmentService.saveAppointment(appointmentEntity);
	}
	
	@PutMapping
	public AppointmentEntity updateappoinments(@RequestBody AppointmentEntity appointmentEntity) {
		return appointmentService.updateAppointment(appointmentEntity);
	}
	
	@DeleteMapping("/{id}")
	public void deleteappoinment(@PathVariable("id") Long id){
		appointmentService.delete(id);
	}

}
