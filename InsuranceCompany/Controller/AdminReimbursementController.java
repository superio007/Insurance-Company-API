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

import com.example.InsuranceCompany.Entity.AdminReimbursementEntity;
import com.example.InsuranceCompany.Service.AdminReimbursementService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/adminreimbursementclaim")
public class AdminReimbursementController {
	
	private final AdminReimbursementService adminreimbursementservice;

	public AdminReimbursementController(AdminReimbursementService adminreimbursementservice) {
		super();
		this.adminreimbursementservice = adminreimbursementservice;
	}
	
	@GetMapping
	public List<AdminReimbursementEntity> findallreimbursementclaims(){
		return adminreimbursementservice.findalladminreimbursementclaims();
	}
	
	@GetMapping("/{id}")
	public Optional<AdminReimbursementEntity> findclaimbyid(@PathVariable("id") Long id){
		return adminreimbursementservice.findbyadminreimbursementclaimsid(id);
	}
	
	@PostMapping
	public AdminReimbursementEntity saveclaims(@RequestBody AdminReimbursementEntity adminReimbursementEntity) {
		return adminreimbursementservice.saveadminreimbursementclaim(adminReimbursementEntity);
	}
	
	@PutMapping
	public AdminReimbursementEntity updateclaims(@RequestBody AdminReimbursementEntity adminReimbursementEntity) {
		return adminreimbursementservice.updateadminreimbursementclaim(adminReimbursementEntity);
	}
	
	@DeleteMapping("/{id}")
	public void deleteclaim(@PathVariable("id") Long id){
		adminreimbursementservice.deleteadminreimbursementclaim(id);
	}
	

}
