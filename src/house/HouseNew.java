package house;

public class HouseNew {

    String name;
    String address;
    String color;
    double size;
    double price;
    boolean isUsed;

    public HouseNew(){}

    public HouseNew(String name, String address, String color, double size, double price, boolean isUsed) {
        this.name = name;
        this.address = address;
        this.color = color;
        this.size = size;
        this.price = price;
        this.isUsed = isUsed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void bedroom() {
            System.out.println("The house should have bathroom");
        }
        public void layout(){
            System.out.println("The house should have a nice look");
        }

    }

