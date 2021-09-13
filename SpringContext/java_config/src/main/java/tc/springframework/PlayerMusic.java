package tc.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class PlayerMusic {
    @Value("${playerMusic.name}")
    private String name;
    @Value("${playerMusic.volume}")
    private int volume;


    private Music music;

    private List<Music> musicList = new ArrayList<>();

    @PostConstruct
    private void initMethod() {
        System.out.println("Init player music");
    }

    @PreDestroy
    private void destroyMethod() {
        System.out.println("Destroy player music");
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    @Autowired
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Music getMusic() {
        return music;
    }

    @Autowired
    @Qualifier("classicalMusic")
    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        for (Music music : getMusicList()) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    public void playMusic2() {
        System.out.println("Playing: " + getMusic().getSong());
    }
}