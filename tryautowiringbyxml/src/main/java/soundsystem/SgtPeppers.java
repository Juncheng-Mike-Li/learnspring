package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by mike on 16-7-28.
 */
@Component("lovelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
