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

import com.example.InsuranceCompany.Entity.AdminCashlessEntity;
import com.example.InsuranceCompany.Service.AdminCashlessService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/admincashlessclaim")
public class AdminCashlessController {
	
	private final AdminCashlessService admincashlessservice;

	public AdminCashlessController(AdminCashlessService admincashlessservice) {
		super();
		this.admincashlessservice = admincashlessservice;
	}
	
	@GetMapping
	public List<AdminCashlessEntity> findallcashlessclaims(){
		return admincashlessservice.findalladmincashlessclaims();
	}
	
	@GetMapping("/{id}")
	public Optional<AdminCashlessEntity> findclaimbyid(@PathVariable("id") Long id){
		return admincashlessservice.findbyadmincashlessclaimsid(id);
	}
	
	@PostMapping
	public AdminCashlessEntity saveclaims(@RequestBody AdminCashlessEntity admincashlessentity) {
		return admincashlessservice.saveadmincashlessclaim(admincashlessentity);
	}
	
	@PutMapping
	public AdminCashlessEntity updateclaims(@RequestBody AdminCashlessEntity admincashlessentity) {
		return admincashlessservice.updateadmincashlessclaim(admincashlessentity);
	}
	
	@DeleteMapping("/{id}")
	public void deleteclaim(@PathVariable("id") Long id){
		admincashlessservice.deleteadmincashlessclaim(id);
	}

}
