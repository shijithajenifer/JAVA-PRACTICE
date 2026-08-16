import java.util.Scanner;
public class oper{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scan.nextInt();
        System.out.print("Enter b: ");
        int b = scan.nextInt(); 
        System.out.print("Enter Operator: ");
        char op= scan.next().charAt(0);
        if(op == '+'){
            System.out.println(a+b);
        }
        else if(op == '-'){
            System.out.println(a-b);
        }
        else if(op == '*'){
            System.out.println(a*b);
        }
        else if(op == '/'){
            if(b != 0){
                System.out.println((a / b));
            } 
            else {
                System.out.println("Cannot divide by zero");
            }
        }
        else{
            System.out.println("Invalid operator");
        }
       scan.close();
    }
}