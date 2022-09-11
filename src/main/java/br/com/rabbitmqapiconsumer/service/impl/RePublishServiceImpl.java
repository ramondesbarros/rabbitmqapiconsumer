package br.com.rabbitmqapiconsumer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rabbitmqapiconsumer.amqp.AmqpRePublish;
import br.com.rabbitmqapiconsumer.service.RePublishService;

@Service
public class RePublishServiceImpl implements RePublishService {

	@Autowired
	private AmqpRePublish amqpRePublish;

	@Override
	public void repost() {

		amqpRePublish.rePublish();
	}
}
