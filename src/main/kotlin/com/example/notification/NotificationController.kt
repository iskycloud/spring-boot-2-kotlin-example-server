package com.example.notification

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NotificationController {

    @GetMapping(value = "/notifications")
    fun getNotifications() : ResponseEntity<Any> {
        return ResponseEntity.ok().build()
    }
}
