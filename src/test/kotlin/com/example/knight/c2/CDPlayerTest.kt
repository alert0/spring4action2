package com.example.knight.c2

import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner


@RunWith(SpringJUnit4ClassRunner::class)
@ContextConfiguration(classes = arrayOf(CDplayerConfig::class))
class CDPlayerTest {

    @Autowired
    lateinit var cd: CompactDisc


    @Autowired
    lateinit var cdplayer: CDPlayer

    @Test
    fun cdShouldNotBeNull() {
        assertNotNull(cd)
    }


    @Test
    fun player(){
        cdplayer.play()
    }

}