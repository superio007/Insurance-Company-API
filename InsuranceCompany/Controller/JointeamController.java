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

import com.example.InsuranceCompany.Entity.Jointeam;
import com.example.InsuranceCompany.Service.JointeamService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/jointeam")
public class JointeamController {
	
	private final JointeamService jointeamservice;

	public JointeamController(JointeamService jointeamservice) {
		super();
		this.jointeamservice = jointeamservice;
	}
	
	@GetMapping
	public List<Jointeam> findAllContacts(){
		return jointeamservice.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Jointeam> findcontactbyId(@PathVariable ("id")Long id) {
		return jointeamservice.findbyid(id);
	}
	
	@PostMapping
	public Jointeam saveContact(@RequestBody Jointeam jointeam) {
		return jointeamservice.save(jointeam);
	}
	
	@PutMapping
	public Jointeam updateContact(@RequestBody Jointeam jointeam) {
		return jointeamservice.update(jointeam);
	}
	
	@DeleteMapping("/{id}")
	public void deleteContact(@PathVariable("id") Long id) {
		jointeamservice.delete(id);
	}
	

}
