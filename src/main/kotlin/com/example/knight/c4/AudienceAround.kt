package com.example.knight.c4

import org.aspectj.lang.annotation.*
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
class AudienceAround{


    @Pointcut("execution(** com.example.knight.c4.Performance.perform(..))")
    fun performance(){

    }

    @Around("performance()")
    fun watchPerformance( proceedingJoinPoint: ProceedingJoinPoint){
        try {
            println("Silencing cell phones Around ")
            println("Taking seats Around ")
            proceedingJoinPoint.proceed()
            println("clap clap clap Around ")
        } catch (throwable: Throwable) {
            println("Demanding a refund Around")
        }

    }


}