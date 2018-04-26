
package com.example.knight.config

import com.example.knight.BraveKnight
import com.example.knight.Knight
import com.example.knight.Quest
import com.example.knight.SlayDragonQuest
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
