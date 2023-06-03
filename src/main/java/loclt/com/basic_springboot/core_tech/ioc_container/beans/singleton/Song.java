package loclt.com.basic_springboot.core_tech.ioc_container.beans.singleton;

public class Song {
    private String name;
    private String author;
    public Song(String name, String author) {
        this.name = name;
        this.author = author;
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
