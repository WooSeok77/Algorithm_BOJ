import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws  Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrN = new int[n];
        for(int i = 0 ; i < n; i++) {
            arrN[i] = sc.nextInt();
        }
        Arrays.sort(arrN);

        int m = sc.nextInt();
        int[] arrM = new int[m];
        for(int i =0; i < m; i++) {
            arrM[i] = sc.nextInt();
            System.out.println(binarySearch(arrN, arrM[i]));
        }
    }

    public static int binarySearch(int[] arr, int num) {
        int left  = 0;
        int right = arr.length -1;

        while(left <= right) {
            int mid = (left + right) /2;

            if(arr[mid] == num) {
                return 1;
            }
            else if(arr[mid] < num) {
                left = mid + 1;
            }
            else {
                right = mid -1;
            }
        }
        return 0;
    }
}