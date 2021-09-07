package tc.springframework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class PlayerMusic {

    private List<Music> musicList = new ArrayList<>();

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(GenreMusic genreMusic) {
        for (Music music : getMusicList()) {
            if (music.toString().toUpperCase().contains(genreMusic.toString())) {
                Random random = new Random();
                System.out.println("Playing: " + music.getSong().get(random.nextInt(music.getSong().size())));
            }
        }
    }

}
