package com.example.knight

import com.example.knight.config.KnightConfig
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.context.support.AnnotationConfigContextLoader

@RunWith(SpringRunner::class)
@SpringBootTest
@ContextConfiguration(classes = arrayOf(KnightConfig::class), loader = AnnotationConfigContextLoader::class)
class KnightApplicationTests {




    @Autowired
    internal lateinit var knight: Knight

//    @Autowired
//    internal lateinit var printStream: FakePrintStream

    @Test
    fun contextLoads() {
        knight.embarkOnQuest()
    }

}
