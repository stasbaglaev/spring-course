package tc.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        PlayerMusic playerMusic1 = context.getBean("PlayerBean", PlayerMusic.class);
        System.out.println(playerMusic1.getVolume());


        PlayerMusic playerMusic2 = context.getBean("PlayerBean", PlayerMusic.class);
        System.out.println(playerMusic2.getVolume());
//
//        boolean b = playerMusic1 == playerMusic2;
//        System.out.println(b);
//
//        playerMusic1.setVolume(1);
//        System.out.println(playerMusic1.getVolume());
//        System.out.println(playerMusic2.getVolume());

//        System.out.println(playerMusic.getName());
//        System.out.println(playerMusic.getVolume());

        context.close();
    }
}
