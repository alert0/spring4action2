
package com.example.knight.c1

import java.io.PrintStream

class Minstrel(private val stream: PrintStream) {

    fun singBeforeQuest() {
        stream.println("Fa la la, the knight is so brave!")
    }

    fun singAfterQuest() {
        stream.println("Tee hee hee, the brave knight " + "did embark on a quest!")
    }

}
