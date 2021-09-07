package tc.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        PlayerMusic playerMusic = context.getBean("MusicPlayerBean", PlayerMusic.class);
        playerMusic.playMusic(GenreMusic.ROCK);
        context.close();
    }
}
