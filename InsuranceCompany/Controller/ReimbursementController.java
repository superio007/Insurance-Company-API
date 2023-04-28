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

import com.example.InsuranceCompany.Entity.ReimbursementEntity;
import com.example.InsuranceCompany.Service.ReimbursementService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/reimbursementclaims")
public class ReimbursementController {
	
	private final ReimbursementService reimbursementservice;

	public ReimbursementController(ReimbursementService reimbursementservice) {
		super();
		this.reimbursementservice = reimbursementservice;
	}
	
	@GetMapping
	public List<ReimbursementEntity> findall() {
		return reimbursementservice.findall();
	}
	
	@GetMapping("/{id}")
	public Optional<ReimbursementEntity> findbyid(@PathVariable("id") Long id){
		return reimbursementservice.findbyid(id);
	}

	@PostMapping
	public ReimbursementEntity save(@RequestBody ReimbursementEntity reimbursemententity) {
		return reimbursementservice.saveclaim(reimbursemententity);
	}
	
	@PutMapping
	public ReimbursementEntity update(@RequestBody ReimbursementEntity reimbursemententity) {
		return reimbursementservice.updateclaim(reimbursemententity);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		reimbursementservice.deleteclaim(id);
	}
	
}
