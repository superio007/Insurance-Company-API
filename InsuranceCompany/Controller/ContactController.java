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

import com.example.InsuranceCompany.Entity.ContactEntity;
import com.example.InsuranceCompany.Service.ContactService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/Contacts")
public class ContactController {
	
	private final ContactService contactService;

	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}
	
	@GetMapping
	public List<ContactEntity> findAllContacts(){
		return contactService.findAllContact();
	}
	
	@GetMapping("/{id}")
	public Optional<ContactEntity> findcontactbyId(@PathVariable ("id")Long id) {
		return contactService.findbyid(id);
	}
	
	@PostMapping
	public ContactEntity saveContact(@RequestBody ContactEntity contactEntity) {
		return contactService.saveContact(contactEntity);
	}
	
	@PutMapping
	public ContactEntity updateContact(@RequestBody ContactEntity contactEntity) {
		return contactService.updateContact(contactEntity);
	}
	
	@DeleteMapping("/{id}")
	public void deleteContact(@PathVariable("id") Long id) {
		contactService.deletecontact(id);
	}

}
