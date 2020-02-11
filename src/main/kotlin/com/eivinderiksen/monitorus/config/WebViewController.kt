package com.eivinderiksen.monitorus.config

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WebViewController {

    @GetMapping("/")
    fun webApp(entities : Model): String {
        return "index"
    }
}