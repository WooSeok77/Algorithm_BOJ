import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int start = 0;

        for(int i = 0; i <N; i++) {
            int tmp  = Integer.parseInt(br.readLine());

            if(tmp > start) {
                for(int j = start+1; j <=tmp; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                start = tmp;
            } else if(stack.peek() != tmp) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb);

    }
}