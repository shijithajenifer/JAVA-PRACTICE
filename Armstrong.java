import java.util.Scanner;
public class Armstrong{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int original = num; //153
        int sum = 0;
        while(num>0){
            int digit = num%10; //153%10 = 3 // 15%10 = 5 // 1%10 = 1
            sum =  sum + digit*digit*digit; // alrady 0 irukum ah ipo 0+ indha digit 3*3*3 nu multiple panni vechukum //5*5*5 // 1*1*1
            num = num/10; // ipo inga same next set process ah repeat panarku use panrom which acts 153/10=15 ipo indha 15 kaana loop will start. // 15/10 = 1
        }
        if(original == sum){
            System.out.println("It is an armstrong number");
        }
        else{
            System.out.println("It is not a armstrong number");
        }
        scan.close();

    }
}