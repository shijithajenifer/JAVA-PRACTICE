import java.util.Scanner;
public class practice{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int num = scan.nextInt();
        if(i%num==0){
           System.out.println(i+"is divisble by 5");
        }
        else{
            System.out.println("not");
        }
        scan.close();
    }
}