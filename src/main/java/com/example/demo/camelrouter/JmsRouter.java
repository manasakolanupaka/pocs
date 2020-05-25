package com.example.demo.camelrouter;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.demo.entities.AuditEntity;
@Component
public class JmsRouter extends RouteBuilder {
	static final Logger log = LoggerFactory.getLogger(JmsRouter.class);

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		AuditEntity aE= new AuditEntity();
		aE.setAction("post");
		aE.setBody("Test body");
		System.out.println("entering router");
		from("jms:jms.message.testQueue").log(LoggingLevel.DEBUG, log, "New message received").process(exchange -> {
			String convertedMessage = exchange.getMessage().getBody() + " is converted";
			exchange.getMessage().setBody(aE);
		}).toD("http:http://localhost:8000/api/audit/createentry" +"?httpMethod=POST").log(LoggingLevel.DEBUG, log, "Message is successfully sent to the output queue")
				.end();

	}
}
