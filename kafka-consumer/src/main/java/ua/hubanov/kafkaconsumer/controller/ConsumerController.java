package ua.hubanov.kafkaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.hubanov.kafkaconsumer.service.ConsumerService;

import java.util.List;

@RestController
@RequestMapping("/kafka")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping(value = "/getConsumedMessages")
    public List<String> getAllConsumedMessages() {
        return consumerService.getAllConsumedMessages();
    }
}
