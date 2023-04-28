import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalKg = sc.nextInt();
        int counter = 0;

        while (true) {
            if(totalKg%5 == 0) {
                counter += totalKg/5;
                System.out.println(counter);
                break;
            }
            else {
                totalKg -= 3;
                counter++;
            }
            if(totalKg < 0) {
                counter = -1;
                System.out.println(counter);
                break;
            }


        }
    }
}