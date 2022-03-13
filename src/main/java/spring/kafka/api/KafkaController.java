package spring.kafka.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.kafka.producer.KafkaProducer;

@RestController
@RequestMapping(value="/api/v1/kafka")
@RequiredArgsConstructor
public class KafkaController {
    private final KafkaProducer kafkaProducer;

    @PostMapping
    public String sendMessage(@RequestParam String msg) {
        kafkaProducer.sendMessage(msg);
        return "success.";
    }
}
