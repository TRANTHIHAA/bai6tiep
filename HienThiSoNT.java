package VongLapTrongJava;

import java.util.Scanner;

public class HienThiSoNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong SNT: ");
        int coutSNT = sc.nextInt();
        int coutSNT2 = 0;
            for (int num = 1; num < 1000; num++) {
                int count = 0;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        count++;
                    }
                }
                if (count == 0 && num > 1) {
                    System.out.println(num);
                    coutSNT2++;
                }
                if(coutSNT2== coutSNT){
                    break;
                }
            }
    }
}
