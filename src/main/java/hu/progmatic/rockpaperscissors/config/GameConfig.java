package hu.progmatic.rockpaperscissors.config;

import hu.progmatic.rockpaperscissors.model.Game;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class GameConfig {
    @Bean
    public Game gameBean(String randomChoice) {
        return new Game();

    }

    @Bean
    public String randomChoiceBean(Random random) {
        return randomChoice;
    }

    @Bean
    public Random randomBean() {
        return new Random();
    }
}
