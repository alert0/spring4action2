package com.example.knight.c4

interface  Performance{
    fun perform();
}


 class PerformanceTest : Performance  {

    override fun perform() {
        println("PerformanceTest")
    }
}