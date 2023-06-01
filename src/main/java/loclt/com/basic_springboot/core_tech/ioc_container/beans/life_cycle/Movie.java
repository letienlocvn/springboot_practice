package loclt.com.basic_springboot.core_tech.ioc_container.beans.life_cycle;

public class Movie {
    private String name;
    private String author;
    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
