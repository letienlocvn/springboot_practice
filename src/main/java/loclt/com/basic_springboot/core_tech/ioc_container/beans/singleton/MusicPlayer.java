package loclt.com.basic_springboot.core_tech.ioc_container.beans.singleton;

public class MusicPlayer {
    private static MusicPlayer musicPlayer;
    private  MusicPlayer() {
    }

//    global access point
    public static MusicPlayer getMethodInstance() {
        if (musicPlayer == null) {
            musicPlayer = new MusicPlayer();
        }
        return musicPlayer;
    }

    public void playMusic(Song song) {
        System.out.println("Đang phát nhạc " + song.getName() + " của " + song.getAuthor());
    }
}
