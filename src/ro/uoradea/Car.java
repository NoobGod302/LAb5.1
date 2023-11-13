package ro.uoradea;

public class Car extends Vehicle {
    @Override
    public void speedUp(){
        int crestereViteza = 85;

        System.out.println("Viteza masinii a crescut cu " + crestereViteza );
    }
}
