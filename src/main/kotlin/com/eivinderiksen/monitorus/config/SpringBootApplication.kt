package com.eivinderiksen.monitorus.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
@ComponentScan(value = ["com.eivinderiksen.monitorus"])
class SpringBootApplication

fun main(args: Array<String>) {
	runApplication<SpringBootApplication>(*args)
}
