package tc.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        PlayerMusic playerMusic = context.getBean("MusicPlayerBean", PlayerMusic.class);
        playerMusic.playMusic();

//        System.out.println(playerMusic.getName());
//        System.out.println(playerMusic.getVolume());

        context.close();
    }
}
