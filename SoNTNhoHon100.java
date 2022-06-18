package VongLapTrongJava;


public class SoNTNhoHon100 {
    public static void main(String[] args) {
        for( int num = 1; num <= 100; num++) {
            int cout = 0;
            for( int i = 2; i <= Math.sqrt(num);i++){
                if(num % i == 0){
                    cout++;
                }
            }
            if(cout == 0 && num >1){
                System.out.println(num);
            }
        }

    }
}
