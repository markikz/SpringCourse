package org.mark;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("factory");
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Do my init");
    }

    public void doMyDestroy() {
        System.out.println("Do my destroy");
    }

    @Override
    public String getSong() {
        return "ClassicalSong";
    }
}
