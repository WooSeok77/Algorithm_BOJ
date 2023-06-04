import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String array = sc.nextLine();

        char[] str = array.toCharArray();
        Arrays.sort(str);

        StringBuilder sb = new StringBuilder();

        for(int i = str.length-1; i>=0; i--) {
            sb.append(str[i]);
        }

        System.out.println(sb);
    }
}