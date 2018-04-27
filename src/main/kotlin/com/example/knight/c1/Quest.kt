package com.example.knight.c1

import java.io.PrintStream

interface Quest {
    fun embark()
}


 class  RescueDamselQuest : Quest {

     override fun embark() {
         System.out.println("Embarking on a quest to rescue the damsel.");
     }
 }



 class SlayDragonQuest(private val stream :PrintStream) : Quest {

     override fun embark() {
         stream.println("Embarking on quest to slay the dragon!");
     }
 }
