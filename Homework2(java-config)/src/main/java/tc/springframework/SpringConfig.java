package tc.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
@ComponentScan("tc.springframework")
public class SpringConfig {

    @Bean
    @Scope("singleton")
    public ClassicalMusic classicalMusicBean() {
        return new ClassicalMusic();
    }

    @Bean
    @Scope("singleton")
    public RockMusic rockMusicBean() {
        return new RockMusic();
    }

    @Bean
    @Scope("singleton")
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public List<Music> musicList() {
        return List.of(classicalMusicBean(), rockMusicBean(), jazzMusic());
    }

    @Bean
    @Scope("prototype")
    public PlayerMusic playerMusic() {
        return new PlayerMusic(musicList());
    }
}