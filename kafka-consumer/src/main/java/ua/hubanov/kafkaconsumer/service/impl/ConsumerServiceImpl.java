package ua.hubanov.kafkaconsumer.service.impl;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ua.hubanov.kafkaconsumer.service.ConsumerService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    private final List<String> consumedMessages = new ArrayList<>();

    @KafkaListener(topics = "test_topic", groupId = "ua.hubanov")
    public void consume(String message) throws IOException {
        System.out.println("Consumed message: " + message);
        consumedMessages.add(message);
    }

    @Override
    public List<String> getAllConsumedMessages() {
        return consumedMessages;
    }
}
