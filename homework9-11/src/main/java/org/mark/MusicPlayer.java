package org.mark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;

    private Random random = new Random();

    //Inversion of Control
    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public void playMusic(Genre genre) {
        if (genre == Genre.CLASSICAL) {
            System.out.println("Playing: " + classicalMusic.getSongs().get(random.nextInt(3)));
        } else {

            System.out.println("Playing: " + rockMusic.getSongs().get(random.nextInt(3)));
        }


    }

}
