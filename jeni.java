import java.util.Scanner;
public class jeni{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        String name=scan.nextLine();
        int a= scan.nextInt();
        scan.nextLine();
        String add= scan.nextLine();
        System.out.println("java"+ name);
        System.out.println("java"+ a);
        System.out.println("java"+ add);
        scan.close();
    }
}