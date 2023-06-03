import java.util.*;
import java.io.IOException;
//팩토리얼 문제
//이항계수의 공식 이항계수 n,k --> n!/k!(n-k)!
public class Main {
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        int K = Integer.parseInt(br.readLine());

         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int K = sc.nextInt();

        System.out.println(factorial(N)/(factorial(K)*factorial(N-K)));
        


    }
    public static int factorial(int a) {
        if(a ==0)
            return 1;
        else {
            return a * factorial(a-1);
        }


    }
}