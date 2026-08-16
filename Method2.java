import java.util.Scanner;

public class Method2 {
    // take the number as parameter and return its reverse
    public static int rev(int num){
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;   
        }
        return reverse;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.print(rev(num));// call static method directly
        scan.close();
    }
}
/*import java.util.Scanner;
public class Method2 {
    public static int rev(){
        int num=0;
        int reverse=0;
        int digit=0;
        while (num<=0) {
            digit=num%10;
            reverse= reverse*10+digit;
            num=num/10;   
        }
        return reverse;
    }


    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        Method2 revint=new Method2();
        System.out.print(revint.rev());

    }
}/* */