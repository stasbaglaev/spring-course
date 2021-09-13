package tc.springframework;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.load("classpath:applicationContext.xml");
        context.refresh();

        JazzMusic jazzMusic = context.getBean("JazzMusicBean", JazzMusic.class);
        System.out.println(jazzMusic.getSong());

        PlayerMusic playerMusic = context.getBean("PlayerBean", PlayerMusic.class);
        System.out.println(playerMusic.getVolume());

        context.close();
    }
}
