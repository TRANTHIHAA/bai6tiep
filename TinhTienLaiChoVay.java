package VongLapTrongJava;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so tien");
        money = input.nextDouble();

        System.out.println("nhap so thang");
        month = input.nextInt();

        System.out.println("nhap lai suat");
        interestRate = input.nextDouble();

        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: "+ totalInterest);
    }
}
