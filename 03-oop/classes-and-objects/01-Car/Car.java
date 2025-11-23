
public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println("The " + this.model +" is starting...");
    }

    public void stop(){
        System.out.println("The " + this.model +" is stopping...");
    }
}
