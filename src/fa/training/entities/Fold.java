package fa.training.entities;

import java.util.Scanner;

public class Fold extends Car {
    private int year;
    private int manufacturerDiscount;

    @Override
    double getSalePrice() {
        return (regularPrice - manufacturerDiscount);
    }

    @Override
    public void inputInfoCar(Scanner scanner) {
        /**
         * Call inputInfoCar method from parent class.
         *
         */
        super.inputInfoCar(scanner);
        System.out.println("Enter the year of the fold: ");
        year = scanner.nextInt();
        System.out.println("Enter manufacturerDiscount: ");
        manufacturerDiscount = scanner.nextInt();
        System.out.println("-----------------------------");

    }

    @Override
    public void display() {
        /**
         * Call method of parent class
         */
        super.display();
        System.out.println("Year of the fold: " + year + "\t" + " Final price: " + this.getSalePrice() + "\n");
    }
}
