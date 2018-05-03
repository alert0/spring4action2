package com.example.knight.c4

import com.example.knight.c1.Knight
import com.example.knight.c1.config.KnightConfig
import com.example.knight.c2.CDPlayer
import com.example.knight.c4.Config.ConcerConfig
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.context.support.AnnotationConfigContextLoader

@RunWith(SpringRunner::class)
@SpringBootTest
@ContextConfiguration(classes = arrayOf(ConcerConfig::class), loader = AnnotationConfigContextLoader::class)
class Test4 {

    @Autowired
    lateinit var audience: Audience


    @Autowired
    lateinit var performance :Performance


    @Autowired
    lateinit var  audienceAround : AudienceAround

    @Autowired
    lateinit var  cd : Cd


    @Autowired
    lateinit var  trackCounter : TrackCounter


    @Test
    fun cdShouldNotBeNull() {
        Assert.assertNotNull(audience)
    }



    @Test
    fun test2(){
        performance.perform()
    }



    @Test
    ///cd player
    fun testplayer(){
        cd.play(1)
        println( trackCounter.getPlayCount(1 )  )
    }
//    @Test
//    fun TestAroud() {
//        audienceAround.performance()
//    }


}
