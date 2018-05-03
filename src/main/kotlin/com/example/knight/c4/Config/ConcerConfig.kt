package com.example.knight.c4.Config

import com.example.knight.c4.*
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy


@EnableAspectJAutoProxy
@Configuration
@ComponentScan
class ConcerConfig {


    @Bean
    fun audience() :Audience {
         return   Audience()
     }

    @Bean
    fun audienceAround() :AudienceAround{
        return AudienceAround()
    }

    @Bean
    fun Performance() : Performance {
        return   PerformanceTest()
    }


    @Bean
    fun cd() : Cdplayer{
        return Cdplayer()
    }


    @Bean
    fun trackCounter() : TrackCounter {
        return TrackCounter()
    }
}