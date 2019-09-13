package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinExampleServerApplication

fun main(args: Array<String>) {
	runApplication<SpringKotlinExampleServerApplication>(*args)
}
