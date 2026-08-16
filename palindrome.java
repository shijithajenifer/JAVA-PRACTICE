import java.util.Scanner;
public class palindrome{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int correctnum = num;
        int reverse = 0;
        while(num>0){
            int digit = num%10;
            reverse =  reverse*10 + digit;
            num = num/10;
        }
        if(correctnum == reverse){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
        scan.close();
    }
}
