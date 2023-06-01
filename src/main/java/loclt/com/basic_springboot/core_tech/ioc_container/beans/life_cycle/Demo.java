package loclt.com.basic_springboot.core_tech.ioc_container.beans.life_cycle;

import loclt.com.basic_springboot.core_tech.ioc_container.beans.life_cycle.config.AppConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        WatchMovie watchMovie = context.getBean(WatchMovie.class);
        watchMovie.watchingMovie();
        context.close();
    }
}
