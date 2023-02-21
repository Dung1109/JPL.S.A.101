package fa.training.entities;

import java.util.Scanner;

public class Truck extends Car{
    private int weight;

    @Override
    double getSalePrice() {
        if(weight>2000){
            return regularPrice*0.9;
        }
        else{
            return regularPrice*0.8;
        }
    }

    @Override
    public void inputInfoCar(Scanner scanner){
        /**
         * Call inputInfoCar method from parent class.
         *
         */
        super.inputInfoCar(scanner);
        System.out.println("Enter weight of truck: ");
        weight = scanner.nextInt();
        System.out.println("-----------------------------");
    }

    @Override
    public void display() {
        //Call method of parent class
        super.display();
        System.out.println("Weight of truck: " + weight + "\t" + " Final price: " + this.getSalePrice() + "\n");
    }
}
