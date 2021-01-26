package org.mark;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockMusic implements Music {
    ArrayList<String> rockSongs;
    {
        rockSongs = new ArrayList<>();
        rockSongs.add("RockSongs1");
        rockSongs.add("RockSongs2");
        rockSongs.add("RockSongs3");
    }

    @Override
    public ArrayList<String> getSongs() {
        return rockSongs;
    }
}
