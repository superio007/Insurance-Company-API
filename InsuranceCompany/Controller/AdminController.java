package com.example.InsuranceCompany.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.InsuranceCompany.Entity.AdminEntity;
import com.example.InsuranceCompany.Service.AdminService;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminservice;

	public AdminController(AdminService adminservice) {
		super();
		this.adminservice = adminservice;
	}
	
	@GetMapping
	public List<AdminEntity> findAll(){
		return adminservice.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<AdminEntity> findbyId(@PathVariable ("id")Long id) {
		return adminservice.findbyid(id);
	}
	
	@PostMapping
	public AdminEntity save(@RequestBody AdminEntity adminEntity) {
		return adminservice.save(adminEntity);
	}
	
	@PutMapping
	public AdminEntity update(@RequestBody AdminEntity adminEntity) {
		return adminservice.update(adminEntity);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		adminservice.delete(id);
	}

}
