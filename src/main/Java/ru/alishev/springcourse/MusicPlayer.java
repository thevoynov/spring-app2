package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;




@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;



    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

//    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;

//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }
////    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    public String playMusic() {
//        return "Playing music1: " +
//                music1.getSong() + "\nPlaying music2: " +
//                music2.getSong();
//public String playMusic() {
//    return "Playing music1: " +
//            music1.getSong() + "\nPlaying music2: " +
//            music2.getSong();


//        System.out.println("Playing: " +
//                classicalMusic.getSong());
//        System.out.println("Playing: " +
//                rockMusic.getSong());


    public String playMusic() {
    return "Playing music1: " +
            music1.getSong() + "\nPlaying music2: " +
            music2.getSong();
    }
}

