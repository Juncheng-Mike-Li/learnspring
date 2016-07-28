package soundsystem;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mike on 16-7-28.
 */
//@Configuration
//@ComponentScan
//public class CDPlayerConfig {
//}

@Configuration
public class CDPlayerConfig {
    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisc sgtPeppers() { return new SgtPeppers(); }

    @Bean
    public MediaPlayer cdPlayer(CompactDisc compactDisc) {
//        return new CDPlayer(compactDisc);
        return new CDPlayer().setCd(compactDisc);
    }
}
