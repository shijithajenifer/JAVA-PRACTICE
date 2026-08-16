import java.util.Scanner;
public class basics{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
       if(num>0){
        if(num%2==0){
             System.out.println(num +" is a positive even");        
            }
        else{
            System.out.println(num + " is a positive odd");
        }
       }
       else if(num<0){
        if(num%2!=0){
           System.out.println(num +" is a negative odd");
        } 
        else{
            System.out.println(num +" is a negative even");
        }
       }
       else{
        System.out.println("zero");
       }
       scan.close();
    }
}