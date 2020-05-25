package com.example.demo.configuration;

import javax.jms.ConnectionFactory;

import org.apache.activemq.broker.region.Queue;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.connection.JmsTransactionManager;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageType;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.camel.component.jms.JmsComponent;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
@EnableJms
public class ActiveMQConfig {

	/*
	 * @Bean public JmsTransactionManager jmsTransactionManager(final
	 * ConnectionFactory connectionFactory) { JmsTransactionManager
	 * jmsTransactionManager = new JmsTransactionManager();
	 * jmsTransactionManager.setConnectionFactory(connectionFactory); return
	 * jmsTransactionManager; }
	 * 
	 * @Bean public JmsComponent jmsComponent(final ConnectionFactory
	 * connectionFactory, final JmsTransactionManager jmsTransactionManager) {
	 * JmsComponent jmsComponent =
	 * JmsComponent.jmsComponentTransacted(connectionFactory,
	 * jmsTransactionManager); return jmsComponent; }
	 */
	@Bean
    public JmsListenerContainerFactory<?> myFactory(
                            ConnectionFactory connectionFactory,
                            DefaultJmsListenerContainerFactoryConfigurer configurer) 
    {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        // This provides all boot's default to this factory, including the message converter
        configurer.configure(factory, connectionFactory);
        // You could still override some of Boot's default if necessary.
        return factory;
    }
 
    @Bean
    public MappingJackson2MessageConverter jacksonJmsMessageConverter() 
    {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        return converter;
    }
}