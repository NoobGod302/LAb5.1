package ro.uoradea;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("Viteza actuala a masinii este: " + car.getSpeed());
        car.speedUp();

        Bicycle bicycle = new Bicycle();

        System.out.println("Viteza actuala a bicicletei este: "+ bicycle.getSpeed());
        bicycle.speedUp();
    }

}
