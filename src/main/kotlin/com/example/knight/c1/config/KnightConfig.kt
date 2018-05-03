
package com.example.knight.c1.config

import com.example.knight.c1.BraveKnight
import com.example.knight.c1.Knight
import com.example.knight.c1.Quest
import com.example.knight.c1.SlayDragonQuest
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration



@Configuration
class KnightConfig {

    @Bean
    fun knight(): Knight {
        return BraveKnight(quest());
    }

    @Bean
    fun quest(): Quest {
        return SlayDragonQuest(System.out);
    }

}
