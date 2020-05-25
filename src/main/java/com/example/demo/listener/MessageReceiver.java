package com.example.demo.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.example.demo.entities.EmployeeEntity;
 
@Component
public class MessageReceiver {
 
    @JmsListener(destination = "jms.message.testQueue")
    public void receiveMessage(EmployeeEntity e) 
    {
        System.out.println("Received " + e );
    }
}