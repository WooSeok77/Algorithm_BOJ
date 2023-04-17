import java.util.Scanner;
public class Main {
    public static int GCD(int a , int b) {
        if(b==0) return a;
        else return GCD(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int MAX, MIN;

        if(a > b) {
             MAX = a;
             MIN = b;
        } else if (a == b) {
            MAX = a;
            MIN = MAX;
        } else {
            MAX = b;
            MIN = a;
        }

        int MAX2 = GCD(MAX, MIN);
        int MIN2 = a*b/MAX2;

        System.out.println(MAX2);
        System.out.println(MIN2);


    }
}