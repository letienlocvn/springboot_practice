package loclt.com.basic_springboot.core_tech.ioc_container.beans.life_cycle.config;

import loclt.com.basic_springboot.core_tech.ioc_container.beans.life_cycle.Movie;
import loclt.com.basic_springboot.core_tech.ioc_container.beans.life_cycle.WatchMovie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Movie myMovie() {
        return new Movie();
    }

    @Bean
    public WatchMovie myMyWatching() {
        return new WatchMovie(myMovie());
    }
}
