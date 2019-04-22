package net.jiftech.sbkjooq.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PostController {
    @PostMapping("post")
    fun post(@RequestBody body: String): ResponseEntity<String> {
        println(body)
        return ResponseEntity.ok(body)
    }
}