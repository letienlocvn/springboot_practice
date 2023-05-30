package loclt.com.basic_springboot.core_tech.DI;

public class FootballPlayer {

    private String name;
    private Shoes shoes;

    public FootballPlayer(String name, Shoes shoe) {
        this.name = name;
        this.shoes = shoe;
    }


    public String goWithMyGirlFriend() {
        return "Hey girl, do you like my " + this.shoes.sneakerShoes();
    }

    public String playFootball() {
        return "I will be best player with my " + this.shoes.sportShoes();
    }
}
