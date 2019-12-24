package house;

public class HouseTest {
    public static void main(String[] args) {
        //HouseNew(String name, String address, String color, char size, double price, boolean isUsed)

        HouseNew house = new HouseNew("Name","Address","Color",2500,250000,true);
        System.out.println("The house should have unique name" +house.name);
        System.out.println("The house should have address"+ house.address);
        System.out.println("The house should have nice color"+house.color);
        System.out.println("The size should be     "+house.size);
        System.out.println("The house price at the time Sajad bought it     "+house.price);
        System.out.println("");
        System.out.println("");
        System.out.println("------------------------The New Price After the Fire on Dec 23, 2019------------------------------------");
        System.out.println("");
//  I created the 1st step of the required question

        house.setPrice(50000);
        System.out.println("The House price dropped down after the fire destroyed the house   "+house.getPrice());
    }
}
