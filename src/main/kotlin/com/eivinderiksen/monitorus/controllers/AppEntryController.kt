package com.eivinderiksen.monitorus.controllers

import com.eivinderiksen.monitorus.entities.AppEntry
import com.eivinderiksen.monitorus.repositories.AppEntryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/app_entry")
class AppEntryController {

    @Autowired
    lateinit var appEntryRepository: AppEntryRepository

    @GetMapping
    fun getAppEntryList(): Iterable<AppEntry> {
        return appEntryRepository.findAll()
    }

}