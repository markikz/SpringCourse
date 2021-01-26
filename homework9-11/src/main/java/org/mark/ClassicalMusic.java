package org.mark;


import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ClassicalMusic implements Music {
    ArrayList<String> classicalSongs;
    {
        classicalSongs = new ArrayList<>();
        classicalSongs.add("ClassicalSong1");
        classicalSongs.add("ClassicalSong2");
        classicalSongs.add("ClassicalSong3");
    }

    @Override
    public ArrayList<String> getSongs() {
        return classicalSongs;
    }
}
