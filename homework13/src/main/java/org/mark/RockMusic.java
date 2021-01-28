package org.mark;

import org.springframework.stereotype.Component;


public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "RockSong";
    }

}
