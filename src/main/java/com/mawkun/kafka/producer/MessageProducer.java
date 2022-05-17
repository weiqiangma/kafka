package com.mawkun.kafka.producer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageProducer {
    private final static String TOPIC_NAME = "text_message";


    @RequestMapping("/send")
    public void send() {

    }


}
