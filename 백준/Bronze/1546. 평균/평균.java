import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int count;
        Scanner sc = new Scanner(System.in);

        count = sc.nextInt(); //시험본 과목 개수 입력.

        double avg =0 ;
        double[] a = new double[count]; //과목 개수에 따른 점수배열 크기 지정

        double max = a[0];
        for(int i = 0; i < a.length ; i++) {
            a[i] = sc.nextInt();
            if(max < a[i]) {
                max = a[i];
            }
        }

        for(int m = 0; m <a.length; m++) {
            avg += (((a[m] / max) * 100) / count);
        }
        System.out.println(avg);
    }
}
