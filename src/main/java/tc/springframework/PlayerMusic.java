package tc.springframework;

import java.util.ArrayList;
import java.util.List;

public class PlayerMusic {
    private String name;
    private int volume;
    private Music music;

    private List<Music> musicList = new ArrayList<>();

    public List<Music> getMusicList() {
        return musicList;
    }

    public PlayerMusic() {
    }

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

    public PlayerMusic(Music music) {
        this.music = music;
    }


    public void playMusic() {
        for (Music music : getMusicList()) {
            System.out.println("Playing: " + music.getSong());
        }
    }

//    public void playMusic(){
//        System.out.println("Playing: " + music.getSong());
//    }
}
