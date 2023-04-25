import java.util.Scanner;
//indexof 사용
//속해있지않으면 기본적으로 -1을 출력해준다는 이점
//아스키코드 활용
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        for(int i = 'a'; i <= 'z'; i++) {
            System.out.print(word.indexOf(i) + " ");
        }

    }
}