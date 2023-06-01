package loclt.com.basic_springboot.core_tech.ioc_container.beans.life_cycle;

public class ConstructorBaseInjection {

    // Tại đây ConstructorBaseInjection() có một dependency là Movie
    private final Movie movie;

    // The Spring container can inject a MovieFinder
    public ConstructorBaseInjection(Movie movie) {
        this.movie = movie;
    }
}
