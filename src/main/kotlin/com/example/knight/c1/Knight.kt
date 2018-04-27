package com.example.knight.c1

interface Knight {

    fun embarkOnQuest()

}


class BraveKnight(private val quest: Quest) : Knight {

    override  fun  embarkOnQuest() {
        quest.embark()
    }

}

class DamselRescuingKnight : Knight {

    private val quest: RescueDamselQuest

    init {
        this.quest = RescueDamselQuest()
    }

    override  fun embarkOnQuest() {
        quest.embark()
    }

}