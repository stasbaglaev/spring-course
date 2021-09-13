package tc.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class PlayerMusic {

    private List<Music> musicList = new ArrayList<>();

    public List<Music> getMusicList() {
        return musicList;
    }

    @Autowired
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(GenreMusic genreMusic) {
        Random random = new Random();
        for (Music music : getMusicList()) {
            if (music.toString().toUpperCase().contains(genreMusic.toString())) {
                System.out.println("Playing: " + music.getSong().get(random.nextInt(music.getSong().size())));
            }
        }
    }
}