import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word  = sc.next();

        for(int i= 0 ; i < word.length(); i++) {
            if('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
                System.out.print((char)('a' + word.charAt(i) - 'A'));
            }else {
                System.out.print((char)('A' + word.charAt(i) - 'a'));
            }
        }


    }
}