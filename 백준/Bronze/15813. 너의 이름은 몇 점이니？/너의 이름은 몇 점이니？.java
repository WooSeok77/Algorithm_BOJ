import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 이름의 길이 입력
        int name_length = sc.nextInt();
        
        // 이름 입력
        String name = sc.next();
        
        // 알파벳에 해당하는 점수를 저장하는 배열 생성
        int[] scoreArr = new int[26];
        for (int i = 0; i < 26; i++) {
            scoreArr[i] = i + 1; // 알파벳 순서를 점수로 저장
        }
        
        // "이름점수" 계산
        int name_score = 0;
        for (int i = 0; i < name_length; i++) {
            char ch = name.charAt(i);
            name_score += scoreArr[ch - 'A']; // 알파벳에 해당하는 점수를 더함
        }
        
        // 결과 출력
        System.out.println(name_score);
        
        sc.close();
    }
}