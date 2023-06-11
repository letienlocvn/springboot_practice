package loclt.com.basic_springboot.core_tech.ioc_container.beans.singleton.config;

import loclt.com.basic_springboot.core_tech.ioc_container.beans.singleton.bean.MusicPlayer;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfigSingleton {



    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public MusicPlayer musicPlayer() {
        return new MusicPlayer();
    }

}
