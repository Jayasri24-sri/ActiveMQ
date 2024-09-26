package com.example.demo.consumer;
import com.example.demo.model.Message;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    @JmsListener(destination = "activemq:queue:EXAMPLE")
    public void receiveMessage(Message message) {
        System.out.println("Received message: " + message.getText());
    }
}