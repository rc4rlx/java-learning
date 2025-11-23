
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2025);
        Car car3 = new Car("Ford", "Mustang", 2025);


        car1.start();
        car2.start();
        car3.start();

        System.out.println();

        car1.stop();
        car2.stop();
        car3.stop();
    }
}
