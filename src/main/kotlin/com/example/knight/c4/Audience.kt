package com.example.knight.c4

import org.aspectj.lang.annotation.*


class Audience{


    @Before("execution(** com.example.knight.c4.Performance.perform(..))")
    fun silenceCellPhones(){
        println("silencing cell phones")
    }

    @Before("execution(** com.example.knight.c4.Performance.perform(..))")
    fun takeSeats(){
        println("taking seats")
    }

    @AfterReturning("execution(** com.example.knight.c4.Performance.perform(..))")
    fun applause(){
        println("CLAP CLAP CLAP")
    }

    @AfterThrowing("execution(** com.example.knight.c4.Performance.perform(..))")
    fun demandRefund() {
        println("Demanding a refund")
    }


}