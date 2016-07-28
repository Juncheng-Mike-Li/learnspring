package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by mike on 16-7-28.
 */
@Component
public class CDPlayer implements MediaPlayer {
    //    @Autowired
    private CompactDisc compactDisc;

    public CDPlayer() {}

//    @Autowired
//    public CDPlayer(CompactDisc compactDisc) {
//        this.compactDisc = compactDisc;
//    }

//    @Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }
}
