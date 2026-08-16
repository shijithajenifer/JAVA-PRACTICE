import java.util.Scanner;
public class demo{
    public static void main(String []args){
        Scanner scan= new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i] =scan.nextInt();
        }      
        for(int i=0;1<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.print(arr);
        scan.close();
    }
}
