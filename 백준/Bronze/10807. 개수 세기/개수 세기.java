import java.util.Scanner;
import java.util.StringTokenizer;
//스캐너와 StringTokenizer를 정의
//첫째줄 n개의 정수 --> Num변수 Scanner를통해서 입력받는다.
//int Num = sc.nextInt();

//두번째 줄은 n개의 정수만큼의 배열
//int[] arr = new int[Num];

//세번째는 찾아야될 수
//찾으면 증가되는 count까지

//int find = sc.nextInt();
//int count =0;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        sc.nextLine();
        StringTokenizer token = new StringTokenizer(sc.nextLine());
        int[] arr = new int[Num];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }
        int find = sc.nextInt();
        int count = 0;

        for(int j = 0; j < arr.length; j++) {
            if(arr[j] == find)
                count++;
        }
        System.out.println(count);

    }
}