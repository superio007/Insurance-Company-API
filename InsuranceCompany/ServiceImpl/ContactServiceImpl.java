package com.example.InsuranceCompany.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.InsuranceCompany.Entity.ContactEntity;
import com.example.InsuranceCompany.Repository.ContactRepository;
import com.example.InsuranceCompany.Service.ContactService;

@Service
public class ContactServiceImpl implements ContactService{
	
	private final ContactRepository contactRepository;

	public ContactServiceImpl(ContactRepository contactRepository) {
		super();
		this.contactRepository = contactRepository;
	}

	@Override
	public List<ContactEntity> findAllContact() {
		return contactRepository.findAll();
	}

	@Override
	public Optional<ContactEntity> findbyid(Long id) {
		return contactRepository.findById(id);
	}

	@Override
	public ContactEntity saveContact(ContactEntity contactentity) {
		return contactRepository.save(contactentity);
	}

	@Override
	public ContactEntity updateContact(ContactEntity contactentity) {
		return contactRepository.save(contactentity);
	}

	@Override
	public void deletecontact(Long id) {
		contactRepository.deleteById(id);
		
	}

}
