package com.example.knight.c4

interface  Cd {
    open  fun play( i : Int)
}


public open class Cdplayer :Cd {

    open  override fun play(i: Int) {
       println("播放 $i");
    }

}