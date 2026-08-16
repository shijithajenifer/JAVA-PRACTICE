//Running sum of an array.
import java.util.Scanner;
public class prob1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        scan.close();
    }
}
