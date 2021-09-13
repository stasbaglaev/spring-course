package tc.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);

        PlayerMusic playerMusic1 = context.getBean("playerMusic", PlayerMusic.class);
        System.out.println("Player " + playerMusic1.getName() + ", volume: " + playerMusic1.getVolume());
        playerMusic1.playMusic();

        Music music1 = context.getBean("classicalMusic", ClassicalMusic.class);
        Music music2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println("Used scope=singleton for class ClassicalMusic. Equal object references? " + (music1 == music2));

        Music music3 = context.getBean("rockMusic", RockMusic.class);
        Music music4 = context.getBean("rockMusic", RockMusic.class);
        System.out.println("Used scope=prototype for class RockMusic. Equal object references? " + (music3 == music4));

        PlayerMusic playerMusic2 = context.getBean("playerMusic", PlayerMusic.class);
        playerMusic2.playMusic2();

        context.close();
    }
}
