package org.mark;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer player =
                context.getBean("musicPlayer", MusicPlayer.class);

        player.playMusic(Genre.CLASSICAL);
        player.playMusic(Genre.CLASSICAL);
        player.playMusic(Genre.CLASSICAL);
        player.playMusic(Genre.CLASSICAL);
        player.playMusic(Genre.CLASSICAL);
        player.playMusic(Genre.CLASSICAL);

        player.playMusic(Genre.ROCK);
        player.playMusic(Genre.ROCK);
        player.playMusic(Genre.ROCK);
        player.playMusic(Genre.ROCK);
        player.playMusic(Genre.ROCK);
        player.playMusic(Genre.ROCK);
        player.playMusic(Genre.ROCK);
        player.playMusic(Genre.ROCK);
        player.playMusic(Genre.ROCK);


        context.close();
    }
}

