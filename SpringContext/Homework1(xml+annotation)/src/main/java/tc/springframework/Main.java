package tc.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        PlayerMusic playerMusic = context.getBean("playerMusic", PlayerMusic.class);
        playerMusic.playMusic(GenreMusic.CLASSICAL);
        playerMusic.playMusic(GenreMusic.ROCK);
        context.close();
    }
}