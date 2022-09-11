package br.com.rabbitmqapiconsumer.service.impl;

import org.springframework.stereotype.Service;

import br.com.rabbitmqapiconsumer.dto.Person;
import br.com.rabbitmqapiconsumer.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public void action(Person message) {

		try {
			System.out.println(message.getFirstname());

		} catch (Exception e) {

		}
	}
}
