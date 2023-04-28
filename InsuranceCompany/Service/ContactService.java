package com.example.InsuranceCompany.Service;

import java.util.List;
import java.util.Optional;

import com.example.InsuranceCompany.Entity.ContactEntity;

public interface ContactService {
	
	List<ContactEntity> findAllContact();
	Optional<ContactEntity> findbyid(Long id);
	ContactEntity saveContact(ContactEntity contactentity);
	ContactEntity updateContact(ContactEntity contactentity);
	void deletecontact(Long id);

}
