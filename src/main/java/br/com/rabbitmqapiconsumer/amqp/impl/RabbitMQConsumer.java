package br.com.rabbitmqapiconsumer.amqp.impl;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.rabbitmqapiconsumer.amqp.AmqpConsumer;
import br.com.rabbitmqapiconsumer.dto.Person;
import br.com.rabbitmqapiconsumer.service.PersonService;

@Component
public class RabbitMQConsumer implements AmqpConsumer<Person> {

	@Autowired
	private PersonService personService;

	@Override
	@RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
	public void consumer(Person message) {

		try {
			personService.action(message);
		} catch (Exception ex) {
			throw new AmqpRejectAndDontRequeueException(ex);
		}
	}
}
