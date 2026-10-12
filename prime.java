import java.util.Scanner;
public class prime
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int num=scan.nextInt();
	    
	    for(int i=2;i<=num;i++){
	        boolean val=true;
	        for(int j=2;j<i;j++){
	            if(i%j==0){
	                val=false;
	                break;
	            }
	        }
	        if(val){
	            System.out.print(i+" ");
	        }
	    }
	    scan.close();
	}
}