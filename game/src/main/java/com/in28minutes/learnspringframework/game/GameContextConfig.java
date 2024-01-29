package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameContextConfig {

    @Bean(name = "game")
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }

    @Bean(name = "gameRunner")
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}
