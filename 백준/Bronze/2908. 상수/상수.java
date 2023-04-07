import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;
        int sA , sB;
        a = sc.nextInt();
        b = sc.nextInt();

        sA = 100*(a%10) + (a%100 - (a%10)) + a/100;
        sB = 100*(b%10) + (b%100 - (b%10)) + b/100;

        if(sA > sB) System.out.println(sA);
        else System.out.println(sB);
    }
}