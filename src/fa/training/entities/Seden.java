package fa.training.entities;

import java.util.Scanner;

public class Seden extends Car {
    private int length;

    @Override
    double getSalePrice() {
        if(length>20){
            return regularPrice*0.95;
        }
        else{
            return regularPrice*0.9;
        }
    }

    @Override
    public void inputInfoCar(Scanner scanner) {
        /**
         * Call inputInfoCar method from parent class.
         *
         */
        super.inputInfoCar(scanner);
        System.out.println("Enter the length of the car");
        length = scanner.nextInt();
        System.out.println("-----------------------------");
    }

    @Override
    public void display() {
        /**
         * Call method of parent class.
         */
        super.display();
        System.out.println("The length of the car is " + length + "\t" + " Final price: " + this.regularPrice + "\n");
    }
}
