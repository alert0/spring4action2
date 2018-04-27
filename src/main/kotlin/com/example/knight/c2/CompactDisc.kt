package com.example.knight.c2

import org.springframework.stereotype.Component

interface  CompactDisc {

    fun play()

}

@Component
class  SgtPeppers : CompactDisc {

    override fun play() {
        println("player")
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}