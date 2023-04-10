import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();

        ArrayList<Integer> rand = new ArrayList<>();

        for (int i = 0; i < N ; i++) {
            rand.add(sc.nextInt());
        }

        Collections.sort(rand);

        for (Integer i : rand) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}