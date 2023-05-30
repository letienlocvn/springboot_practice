package loclt.com.basic_springboot.core_tech.DI;

public class PumaStore implements Shoes{
    @Override
    public String sneakerShoes() {
        return "get Sneaker Puma";
    }

    @Override
    public String sportShoes() {
        return "Get Sport Puma";
    }
}
