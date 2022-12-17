package br.com.soultech.condgatewayservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class Boot

fun main(args: Array<String>) {
    runApplication<Boot>(*args)
}
