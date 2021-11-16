package ua.hubanov.kafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.hubanov.kafkaproducer.service.ProducerService;

@RestController
@RequestMapping("/kafka")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @GetMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam String message) {
        producerService.sendMessage(message);
    }
}
