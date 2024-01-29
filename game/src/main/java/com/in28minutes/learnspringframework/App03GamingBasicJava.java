package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameContextConfig;
import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicJava {

    public static void main(String[] args) {
        try( var context = new AnnotationConfigApplicationContext(GameContextConfig.class);){
            context.getBean(GameRunner.class).run();
        };
    }
}
