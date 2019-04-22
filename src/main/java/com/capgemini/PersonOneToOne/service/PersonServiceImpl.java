package com.capgemini.PersonOneToOne.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.PersonOneToOne.dao.PersonDao;
import com.capgemini.PersonOneToOne.entity.Person;
import com.capgemini.PersonOneToOne.entity.Profile;

@Service
public class PersonServiceImpl implements PersonService
{
	@Autowired
	PersonDao dao;

	@Override
	public Person addNew() 
	{
		Person person = new Person(101,"Shraddha",new Profile(11,"se"));
		dao.save(person);
		return null;
	}

	@Override
	public Person getPerson() 
	{
		 Person person = dao.findById(101).get();
		 return person;
	}

}
