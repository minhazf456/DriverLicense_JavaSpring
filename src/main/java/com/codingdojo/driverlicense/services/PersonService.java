package com.codingdojo.driverlicense.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.driverlicense.models.Person;
import com.codingdojo.driverlicense.repositories.PersonRepository;



@Service
public class PersonService {
	private final PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public List<Person> allPerson() {
		return personRepository.findAll();
	}
	
	public Person addPerson(Person person) {
		return personRepository.save(person);
	}
	
	public Person getPerson(Long id) {
		Optional<Person> person = personRepository.findById(id);
		return person.get();
	}
}