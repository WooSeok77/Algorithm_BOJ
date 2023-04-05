import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //System.setIn(new FileInputStream("src/BOJ/input.txt"));
        Scanner sc = new Scanner(System.in);
        int a, b;
        int line3, line4, line5, line6;

        a = sc.nextInt();
        b = sc.nextInt();

        line3 = a * (b - 10*(b/10));
        line5 = a * (b/100);
        line4 = (a * (b - ((b- 10*(b/10)) + 100*(b/100))))/10;
        line6 = a * b;
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
    }
}