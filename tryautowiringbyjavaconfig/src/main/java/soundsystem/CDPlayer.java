package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by mike on 16-7-28.
 */
@Component
public class CDPlayer implements MediaPlayer {
//    @Autowired
    private CompactDisc cd;

    public CDPlayer() {}

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Autowired
    public CDPlayer setCd(CompactDisc cd) {
        this.cd = cd;
        return this;
    }

    @Override
    public void play() {
        cd.play();
    }
}
