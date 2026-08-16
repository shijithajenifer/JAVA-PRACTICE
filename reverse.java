import java.util.Scanner;
public class reverse{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();  //3012
        int reverse = 0;    // used for storing the reversed number
        int digit = 0; // summa initialize pannirukom avlodha
        while(num>0){       // while loop yen na epo mudiyum theriyadhu so
            digit = num%10; //3012%10 = 2    takes only remainder
            reverse = reverse*10 + digit;   // ipo reverse la starting value edhum irukadhu so 0 vachu start pannum apo 0*10=0 dhana then 0+ that remainder 2 reverse la ipo 2 mattuk irukum
            num = num/10; // idhu next set repeat panraku vechurukom because it removes last digit 2 so remaining 301 irukum apro first la same process repeat uh.
        }
        System.out.println(reverse);
        scan.close();
    }
}