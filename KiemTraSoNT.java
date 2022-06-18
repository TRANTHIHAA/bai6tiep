package VongLapTrongJava;


import java.util.Scanner;

public class KiemTraSoNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so: ");
        int number = sc.nextInt();
        if(number<2){
            System.out.println("ko phai so nguyen to");
        } else {
            int i = 2;
            boolean isSNT = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    isSNT = false;
                    break;
                }
                i++;
            }

            if (isSNT) {
                System.out.println(number + " la so NT");
            } else {
                System.out.println(number + " ko phai so NT");
            }
        }
    }

}
