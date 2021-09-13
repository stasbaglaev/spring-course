package tc.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);

        PlayerMusic playerMusic = context.getBean("playerMusic", PlayerMusic.class);
        playerMusic.playMusic();

        context.close();
    }
}
