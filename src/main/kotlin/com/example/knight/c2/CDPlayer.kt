package com.example.knight.c2

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component



class CDPlayer @Autowired
constructor(private val cd: CompactDisc) : MediaPlayer {

    override  fun play() {
        cd.play()
    }

}
