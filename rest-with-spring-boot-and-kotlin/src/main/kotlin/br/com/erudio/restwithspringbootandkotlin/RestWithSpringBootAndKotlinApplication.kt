package br.com.erudio.restwithspringbootandkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestWithSpringBootAndKotlinApplication

fun main(args: Array<String>) {
	runApplication<RestWithSpringBootAndKotlinApplication>(*args)
}
