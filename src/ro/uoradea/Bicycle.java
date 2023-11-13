package ro.uoradea;

public class Bicycle extends Vehicle {
    @Override
    public void speedUp(){
        int crestereViteza = 5;

        System.out.println("Viteza bicicletei a crescut cu " + crestereViteza);
    }
}
