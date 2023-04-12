import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //System.setIn(new FileInputStream("src/BOJ/input.txt"));
        Scanner sc = new Scanner(System.in);


        int[] num = new int[10];
        int[] anum = new int[10];

        for (int i = 0; i < num.length ; i++) {
            num[i] = sc.nextInt();
            anum[i] = num[i] % 42;

        }
        Arrays.sort(anum);


        int count = 1;

        for (int i = 0; i <num.length-1 ; i++) {
            if(anum[i] != anum[i+1]) {
                count++;
            }




        }
        System.out.println(count);


    }
}
