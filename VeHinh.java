package VongLapTrongJava;

import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        int choice;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the triangle");
            System.out.println("3. Draw the triangle2");
            System.out.println("4. Draw the triangle3");
            System.out.println("5. Draw the triangle5");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" Draw the rectangle");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("2. Draw the triangle");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("3. Draw the triangle2");
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("4. Draw the triangle3");
                    for (int i = 0; i < 7; i++) {
                        for( int j = 0; j< 7 - i -1; j++){
                            System.out.print(" ");
                        }
                        for (int k = 0; k < i+1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("5 Draw the triangle4");
                    for (int i = 0; i < 7; i++) {
                        for (int k = 0; k < i+1; k++) {
                            System.out.print(" ");
                        }
                        for( int j = 0; j< 7 - i -1; j++){
                            System.out.print("*");
                        }

                        System.out.println();
                    }
                     break;


            }
        } while (choice != 0);
    }
}

