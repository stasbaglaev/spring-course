package tc.springframework;

import java.util.List;
import java.util.Random;

public class PlayerMusic {
    private final List<Music> musicList;

    public List<Music> getMusicList() {
        return musicList;
    }

    public PlayerMusic(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        System.out.println("Playing: " + getMusicList().get(new Random().nextInt(getMusicList().size())).getSong());
    }
}