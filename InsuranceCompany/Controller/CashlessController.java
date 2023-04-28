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

import com.example.InsuranceCompany.Entity.CashlessEntity;
import com.example.InsuranceCompany.Service.CashlessService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/cashlessclaims")
public class CashlessController {
	
	private final CashlessService cashlessService;

	public CashlessController(CashlessService cashlessService) {
		super();
		this.cashlessService = cashlessService;
	}
	
	@GetMapping
	public List<CashlessEntity> findallcashlessclaims(){
		return cashlessService.findAllCashlessclaims();
	}

	@GetMapping("/{id}")
	public Optional<CashlessEntity> findclaimbyid(@PathVariable("id") Long id){
		return cashlessService.findbyid(id);
	}
	
	@PostMapping
	public CashlessEntity saveclaims(@RequestBody CashlessEntity cashlessEntity) {
		return cashlessService.saveCashlessclaim(cashlessEntity);
	}
	
	@PutMapping
	public CashlessEntity updateclaims(@RequestBody CashlessEntity cashlessEntity) {
		return cashlessService.saveCashlessclaim(cashlessEntity);
	}
	
	@DeleteMapping("/{id}")
	public void deleteclaim(@PathVariable("id") Long id){
		cashlessService.deleteclaim(id);
	}
	
	@GetMapping("/count")
	public long countEntities() {
		long count = cashlessService.getCount();
		return count;
	}
}
