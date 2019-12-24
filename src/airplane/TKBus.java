package airplane;

public class TKBus {

    String name;
    String color;
    char size;
    long price;
    int year;
    boolean isUsed;

    // Create a 2 types of constructor
    //1: Constructor without Parameterized
    //2: Constructor with parameterized
    // access modifier constructor name(it should be the same as the class name) open prenthesis and close  open curly pracket and close bracket No Semicolon in constructor
    public TKBus(){}

    // Constructor with parapmeterized
    //Access modifier constructorname(Same as class name) ( arguments)  { java kew word this. variablename = variable name semicolon }

     public TKBus(String name,String color,char size,long price,int year,boolean isUsed){
        this.name=name;
        this.color=color;
        this.size=size;
        this.year=year;
        this.price=price;
        this.isUsed=isUsed;
     }
     // The price affected because of running time
     public long getPrice(){
        return price;
     }
     public void setPrice(long price){
        this.price=price;
     }


     public void start(){
         System.out.println("It should able to start");
     }
     public void runTheEngine(){
         System.out.println("The Engine should in good condition");
     }
    public void stop(){
        System.out.println("The Engine should be stop");
    }
    public void fly(){
        System.out.println("The airplane able to fly 100 hours in month");
    }

}
