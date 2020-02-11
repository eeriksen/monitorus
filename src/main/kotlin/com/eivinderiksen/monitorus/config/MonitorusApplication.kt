package com.eivinderiksen.monitorus.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@ComponentScan("com.eivinderiksen.monitorus")
@EnableJpaRepositories(basePackages = ["com.eivinderiksen.monitorus.repositories"])
@EntityScan(basePackages = ["com.eivinderiksen.monitorus.entities"])
class MonitorusApplication

fun main(args: Array<String>) {
    runApplication<MonitorusApplication>(*args)
}
