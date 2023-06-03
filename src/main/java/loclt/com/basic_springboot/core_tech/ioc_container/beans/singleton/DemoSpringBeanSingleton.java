package loclt.com.basic_springboot.core_tech.ioc_container.beans.singleton;

import loclt.com.basic_springboot.core_tech.ioc_container.beans.singleton.bean.MusicPlayer;
import loclt.com.basic_springboot.core_tech.ioc_container.beans.singleton.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoSpringBeanSingleton {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        MusicPlayer musicPlayer = app.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
    }
}
