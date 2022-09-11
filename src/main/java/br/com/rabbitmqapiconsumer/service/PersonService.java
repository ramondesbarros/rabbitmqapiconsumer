package br.com.rabbitmqapiconsumer.service;

import br.com.rabbitmqapiconsumer.dto.Person;

public interface PersonService {

	void action(Person message);
}
