import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] j = new int[8];
        String answer = "";

        for (int i = 0; i < j.length ; i++) {
           j[i] = sc.nextInt();
        }

        if(j[0]==1) {
            for (int i = 0; i < j.length - 1; i++) {
                if (j[i + 1] != j[i] + 1) {
                    answer = "mixed";
                    break ;
                } else answer = "ascending";
            }
            System.out.println(answer);
        }

        if(j[0]==8) {
            for (int i = 0; i < j.length - 1; i++) {
                if (j[i + 1] != j[i] - 1) {
                    answer = "mixed";
                    break;
                } else answer = "descending";
            }
            System.out.println(answer);
        }

        if(j[0]!=8 && j[0]!=1) {
            answer = "mixed";
            System.out.println(answer);
        }




    }
}