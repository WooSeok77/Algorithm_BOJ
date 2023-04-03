import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int count;
        Scanner sc = new Scanner(System.in);

        count = sc.nextInt(); 

        double avg =0 ;
        double[] a = new double[count]; 

        double max = a[0];
        for(int i = 0; i < a.length ; i++) {
            a[i] = sc.nextInt();

        }
        for(int i = 0; i < a.length ; i++) {
            if(max < a[i])
                max = a[i];
        }

        for(int m = 0; m <a.length; m++) {
            avg += (a[m] / max * 100) / count;
        }
        System.out.println(avg);
    }
}