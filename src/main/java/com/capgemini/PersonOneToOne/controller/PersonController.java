package com.capgemini.PersonOneToOne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.PersonOneToOne.entity.Person;
import com.capgemini.PersonOneToOne.entity.Profile;
import com.capgemini.PersonOneToOne.service.PersonService;

@RestController
public class PersonController 
{
	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public Person addPerson()
	{
		Person person = new Person(101,"Shraddha",new Profile(11,"se"));
		service.addNew();
		return person;
		
	}

	@RequestMapping("/get")
	public Person getPerson() {
		Person person = service.getPerson();
		return person;
	}

}
