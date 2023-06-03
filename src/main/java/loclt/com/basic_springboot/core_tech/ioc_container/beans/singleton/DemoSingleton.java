package loclt.com.basic_springboot.core_tech.ioc_container.beans.singleton;

public class DemoSingleton {
    // Demo dựa trên lý thuyết.
    public static void main(String[] args) {
        Song favoriteSong = new Song("All of Me", "Le tien Loc");
        // MusicPlayer mp3 = new MusicPlayer() -> Lỗi, vì chúng ta đã chỉ định constructor là private
        MusicPlayer spotify = MusicPlayer.getMethodInstance();
        spotify.playMusic(favoriteSong);
    }
}
