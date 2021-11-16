package ua.hubanov.kafkaconsumer.service;

import java.util.List;

public interface ConsumerService {

    List<String> getAllConsumedMessages();
}
