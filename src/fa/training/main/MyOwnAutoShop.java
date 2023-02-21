package fa.training.main;

import fa.training.entities.Car;
import fa.training.entities.Fold;
import fa.training.entities.Seden;
import fa.training.entities.Truck;

import java.util.Scanner;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Truck: ");
        int a = scanner.nextInt();
        System.out.println("Enter number of Fold: ");
        int b = scanner.nextInt();
        System.out.println("Enter number of Seden: ");
        int c = scanner.nextInt();
        System.out.println("Enter number of Car: " + (a + b + c));
        int n = a + b + c;
        Car[] cars = new Car[n];
        //Create 3 array objects
        Truck[] truck = new Truck[a];
        Fold[] fold = new Fold[b];
        Seden[] seden = new Seden[c];
        for (int i = 0; i < a; i++) {
            truck[i] = new Truck();
            //Call input method
            truck[i].inputInfoCar(scanner);
            //Push to exist array
            cars[i] = truck[i];
        }
        for (int i = 0; i < b; i++) {
            fold[i] = new Fold();
            //Call input method
            fold[i].inputInfoCar(scanner);
            //Push to exist array
            cars[i + a] = fold[i];
        }
        for (int i = 0; i < c; i++) {
            seden[i] = new Seden();
            //Call input method
            seden[i].inputInfoCar(scanner);
            //Push to exist array
            cars[i + a + b] = seden[i];
        }
        for (Car car : cars) {
            car.display();
        }


    }

}

