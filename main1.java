import java.util.Scanner;
public class main1{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a<=b && a<=c){
            System.out.println(a + " is smallest");
        }
        else if(b<=a && b<=c){
            System.out.println(b + " is smallest");
        }
        else{
            System.out.println(c + " is smallest");
        }
        scan.close();
    }
}
