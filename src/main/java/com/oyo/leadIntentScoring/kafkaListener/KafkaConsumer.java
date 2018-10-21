package com.oyo.leadIntentScoring.kafkaListener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.oyo.leadIntentScoring.models.User;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "Kafka_Example_json1",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}