package ua.hubanov.kafkaproducer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ua.hubanov.kafkaproducer.service.ProducerService;

@Service
public class ProducerServiceImpl implements ProducerService {

    private final String TOPIC = "test_topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        System.out.println("Producing the message: " + message);
        kafkaTemplate.send(TOPIC, message);
    }
}
