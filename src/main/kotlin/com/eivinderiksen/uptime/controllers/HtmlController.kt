package com.eivinderiksen.uptime.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun webApp(model : Model): String {
        return "index"
    }
}