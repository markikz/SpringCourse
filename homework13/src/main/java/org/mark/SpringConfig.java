package org.mark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Configuration
@ComponentScan("org.mark")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public ArrayList<Music> musicArrayList(){
        ArrayList tmpList = new ArrayList();
        tmpList.add(classicalMusic());
        tmpList.add(rockMusic());

        return tmpList;
    }

    @Bean
    public MusicPlayer musicPlayer(){

        return new MusicPlayer(musicArrayList());
    }



}
