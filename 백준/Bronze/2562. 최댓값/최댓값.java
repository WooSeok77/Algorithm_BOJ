import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        int MAX = num[0];
        int count = 0;

        for (int i = 0; i <9 ; i++) {
            num[i] = sc.nextInt();
        }


        for (int i = 0; i < 9 ; i++) {
            if(MAX < num[i]){
                MAX = num[i];
                count = i + 1;
            }
        }
        System.out.println(MAX);
        System.out.println(count);

    }
}