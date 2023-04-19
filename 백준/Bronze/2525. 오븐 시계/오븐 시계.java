import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int c = sc.nextInt();

        if(H+((M+c)/60) >= 24 && M+c>=60){
            H = H+((M+c)/60)-24;
            M  = (M+c)%60;
        }else{
            H += (M+c)/60;
            M  = (M+c)%60;
        }
        System.out.println(H + " " + M);

        }

}
