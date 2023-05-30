package loclt.com.basic_springboot.core_tech.DI;

public class Adidas implements Shoes {
    private final String ADIDAS = "ADIDAS";

    @Override
    public String sneakerShoes() {
        return ADIDAS + " Sneaker";
    }

    @Override
    public String sportShoes() {
        return ADIDAS + " Sport";
    }
}
