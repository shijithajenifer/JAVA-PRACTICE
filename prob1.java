//Running sum of an array.
import java.util.Scanner;
public class prob1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt(); //5 (1 2 3 4 5)
        }
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];// Calculates the sum of each element in array by the previous element// 1 remains unchanged, 2+1(previous element)=3..it continues.
        }
        for(int num:arr){
            System.out.print(num+" "); // output: 1 3 6 10 15
        }
        scan.close();
    }
}
