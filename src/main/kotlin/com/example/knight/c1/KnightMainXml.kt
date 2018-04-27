package com.example.knight.c1

import org.springframework.context.support.ClassPathXmlApplicationContext


fun main(args: Array<String>) {
    val context = ClassPathXmlApplicationContext(
            "META-INF/spring/knight.xml")
    val knight = context.getBean(Knight::class.java)
    knight.embarkOnQuest()
    context.close()
}