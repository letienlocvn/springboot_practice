package loclt.com.basic_springboot.core_tech.DI;

public class Nike implements Shoes {
    private final String NIKE = "NIKE";

    @Override
    public String sneakerShoes() {
        return NIKE + " Sneaker";
    }

    @Override
    public String sportShoes() {
        return NIKE + " Sport shoes" ;
    }
}
