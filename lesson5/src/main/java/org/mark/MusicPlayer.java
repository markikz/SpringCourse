package org.mark;

public class MusicPlayer {
    private Music music;

    //Inversion of Control
    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println(music.getSong());
    }
}
