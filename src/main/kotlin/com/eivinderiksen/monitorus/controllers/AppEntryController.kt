package com.eivinderiksen.monitorus.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/app_entry")
class AppEntryController {

    @GetMapping("/")
    fun getAppEntryList(): String {
        return "YES!"
    }

}