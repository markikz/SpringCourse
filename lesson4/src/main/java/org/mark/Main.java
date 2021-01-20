package org.mark;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);

        MusicPlayer musicPlayer = new MusicPlayer(classicalMusic);
        musicPlayer.playMusic();

        context.close();
    }
}

