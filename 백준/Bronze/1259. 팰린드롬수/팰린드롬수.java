import java.util.*;
public class Main{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    while (true) {
        String s = sc.nextLine();
        int n = s.length();
        boolean chk = true;
        if(s.equals("0")) break;
        for (int i = 0; i <= n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) chk = false;  //앞뒤가 다르면 팰린드롬이 아니다
        }
        if (chk) {  //팰린드롬이면 yes 출력
            sb.append("yes\n");
        } else {  //팰린드롬이 아니면 no 출력
            sb.append("no\n");
        }
    }
    System.out.print(sb);
    }
}