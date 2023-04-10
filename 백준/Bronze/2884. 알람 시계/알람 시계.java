import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        int aH;
        int aM;

        if ((H == 0) && (M < 45)) {
            aH = 23;
            aM = M + 15;

        }else if(M < 45){
            aH = H - 1;
            aM = M + 15;
        }else {
            aH = H;
            aM = M-45;
        }
        System.out.println(aH+ " " + aM);
    }
}