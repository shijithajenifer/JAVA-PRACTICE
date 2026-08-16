import java.util.Scanner;
class String1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            String name=scan.nextLine();
          //String name = "Java";
            int count=0;
            for(int i=0;i<name.length();i++){
                char ch = name.charAt(i);
                if(ch == 'a' || ch =='e' || ch =='i' || ch =='o'|| ch =='u'){
                    System.out.print(ch);
                    count++;
                }
            }
            System.out.println(" ");
            System.out.println(count);
            scan.close();
    }
}
