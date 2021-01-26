package org.mark;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);

        System.out.println( classicalMusic.getSong());
        System.out.println( rockMusic.getSong());

        context.close();
    }
}

