package br.com.rabbitmqapiconsumer.amqp;

public interface AmqpConsumer<T> {

	void consumer(T t);
}
