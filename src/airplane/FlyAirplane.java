package airplane;

public class FlyAirplane {
    public static void main(String[] args) {
        //Now need to create the object and initialized the constructor
        // Data type non-primitive String, Array, Class
        TKBus fly = new TKBus("TKBus3402", "White", 'm', 25000000, 2018, true);
        System.out.println("The airplane name     " +fly.name);
        System.out.println("The coor              " +fly.color);
        System.out.println("The size              "+fly.color);
        System.out.println("Sajad bought it       "+fly.price);
        System.out.println("The year              "+fly.year);
        System.out.println("Is able to fly       "+fly.isUsed);
        // For the 2nd part of the questions we just need to initialized the constructor values inside the new Methods and change the Method name
        System.out.println();    // just for the space
        System.out.println();     // just using to create the space
        TKBus jumboJet = new TKBus("TKBus3408","Blue and Red",'L',3000000,2019,false);
        System.out.println("The name               "+jumboJet.name);
        System.out.println("The color              "+jumboJet.color);
        System.out.println("The size               "+jumboJet.size);
        System.out.println("Sajad bought it        "+jumboJet.price );
        System.out.println("The year               "+jumboJet.year);
        System.out.println("Is able to fly         "+jumboJet.isUsed);
        System.out.println();
        System.out.println();

        // The price drop down because too many running hours.
        // In this case we need to create get and set values
        // We need only just for the price only  so for we can create 2 methods one for get and one for the set values

        System.out.println("................The Sajad Airplane Price after too many hours Running.................");
        // jimboJet is created object name for this TKBus 3408
        jumboJet.setPrice(2000000);
        System.out.println("The price after that          "+jumboJet.getPrice());
        System.out.println();

        // If we want to use the Methods then 1st we need to create an object to use these Methods
        // Object of the class is to use the variables and methods Ist we used all of the Variables now We are able to use all of the Methods
        TKBus running = new TKBus();
        running.stop();
running.start();

    }
}

