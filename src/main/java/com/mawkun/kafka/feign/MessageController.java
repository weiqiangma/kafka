package com.mawkun.kafka.feign;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MessageController {

    @RequestMapping("/getMessage")
    public String getMessage() {
        return "hello world";
    }
}
