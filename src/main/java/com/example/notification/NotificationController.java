package com.example.notification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    private static final Logger log =
            LoggerFactory.getLogger(NotificationController.class);

    @PostMapping
    public ResponseEntity<String> notify(
            @RequestBody NotificationRequest request) {

        log.info("🔔 Notification received");
        log.info("Title   : {}", request.getTitle());
        log.info("Message : {}", request.getMessage());

        return ResponseEntity.ok("Notification processed");
    }
}

