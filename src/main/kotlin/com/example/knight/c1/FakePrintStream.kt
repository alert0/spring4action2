package com.example.knight.c1

import java.io.ByteArrayOutputStream
import java.io.PrintStream


class FakePrintStream : PrintStream(ByteArrayOutputStream()) {

    val printedString: String
        get() = printBuffer.toString()

    override fun println(string: String) {
        printBuffer.append(string).append("\n")
    }

    fun clear() {
        printBuffer = StringBuffer()
    }

    companion object {

        private var printBuffer = StringBuffer()
    }
}
