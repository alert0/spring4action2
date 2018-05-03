package com.example.knight.c4

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut

@Aspect
class TrackCounter {

    var trackCounts  = mutableMapOf<Int,Int>()


    @Pointcut("execution(* com.example.knight.c4.Cdplayer.play(int)) && args(number)")
    fun trackPlay(number: Int) {

    }

    @Before("trackPlay(trackNumber)" )
    fun countTrack(trackNumber: Int){
        val ccount = getPlayCount(trackNumber)
        trackCounts[trackNumber] = ccount +1

    }


    fun getPlayCount(trackNumber:Int) : Int {

         if ( trackCounts.containsKey(trackNumber) )

             return  trackCounts.get(trackNumber)!!
         else
             return 0

    }
}