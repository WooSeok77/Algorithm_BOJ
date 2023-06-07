import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] num = new int[N];

        int cnt = 0;

        for(int i  = 0; i < N; i ++) {
            num[i] = sc.nextInt();
        }

        for(int i = N -1; i>=0; i--){
            if(K >= num[i]) {
                cnt += K/num[i];
                K = K%num[i];
            }
        }
        System.out.println(cnt);



    }
}