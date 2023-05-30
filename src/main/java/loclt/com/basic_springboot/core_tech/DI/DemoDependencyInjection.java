package loclt.com.basic_springboot.core_tech.DI;

public class DemoDependencyInjection {
    public static void main(String[] args) {
        /**
         * Old code, not understand problem.
         *
         *  Nike nike = new Nike();
         *  Adidas adidas = new Adidas();
         *  FootballPlayer neymar = new FootballPlayer("Neymar",nike.sportShoes());
         *  FootballPlayer messi = new FootballPlayer("Messi", adidas.sportShoes());
         *  System.out.println(neymar.playFootball());
         *  System.out.println(messi.playFootball());
         * */

        // New code

        //1. new constructor using interface
        Shoes adidasShoe = new Adidas();
        Shoes nikeShoe = new Nike();
        //2. Inject services to client
        FootballPlayer neymar1 = new FootballPlayer("Neymar", adidasShoe);
        FootballPlayer neymar2 = new FootballPlayer("Neymar", nikeShoe);
        System.out.println(neymar1.playFootball());
        System.out.println(neymar2.goWithMyGirlFriend());

    }
}
