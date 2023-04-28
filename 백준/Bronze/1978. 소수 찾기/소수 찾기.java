import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //2부터 자신의 값을 자신값의 루트값까지 확인하기
        //해당방법은 소수찾기 알고리즘 일부참조
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int s = 0;
        for(int i = 0; i < N; i++) {

            // 소수인경우 true, 아닌경우 false
            boolean isPrime = true;

            int num = sc.nextInt();

            if(num == 1) {	// 1 인경우 다음 반복문으로
                continue;
            }
            for(int j = 2; j*j <= num; j++) {
                if(num % j == 0) {
                    isPrime = false;	// 소수가 아니므로 false 로 바꿔줌
                    break;
                }
            }
            if(isPrime) {	// 소수인경우 count 값 1 증가
                s++;
            }
        }
        System.out.println(s);
    }


}
