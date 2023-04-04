import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        int MAX = -1000000;
        int MIN = 1000000;
        count = sc.nextInt();
        int[] num = new int[count];



            for (int i = 0; i < num.length; i++) {
                num[i] = sc.nextInt();

                if (MAX < num[i]) {
                    MAX = num[i];
                }
            }

            for (int i = 0; i < num.length; i++) {
                if (MIN > num[i]) {
                    MIN = num[i];
                }
            }
            if(MAX > 1000000){
                MAX = 1000000;
            }
            if(MIN < -1000000){
                MIN = -1000000;
            }

            if(count == 1){

                MAX = num[0];
                MIN = num[0];

                if(num[0] > 1000000) {
                    MAX = 1000000;
                    MIN = 1000000;
                }
                if(num[0] < -1000000) {
                    MAX = -1000000;
                    MIN = -1000000;
                }
                System.out.println(MIN + " " + MAX);
            }else {

                System.out.println(MIN + " " + MAX);
            }
        }

}