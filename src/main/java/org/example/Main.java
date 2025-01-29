package org.example;

public class Main {
    public static void main(String[] args) {
       
        Car myCar = new Car(4, "Grey", 2.5f, "Gasoline", "Honda");

        myCar.displayInfo();

        myCar.honk();
    }
}
