import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> rand = new ArrayList<>();

        for(int i =0; i < N; i++) {
            rand.add(sc.nextInt());

        }

        Collections.sort(rand, Collections.reverseOrder());

        for(Integer i : rand) {
            sb.append(i).append("\n");

        }
        System.out.println(sb);
    }
}