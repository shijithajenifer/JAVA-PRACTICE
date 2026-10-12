import java.util.Scanner;
public class str2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine().toLowerCase();
        char[] ch=str1.toCharArray();
        /*int Ascii=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='0' && ch[i]<='9') {
                Ascii += ch[i];
            } 
        }
        System.out.println(Ascii);
        scan.close();*/
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='a' && ch[i]!='e' && ch[i]!='i' && ch[i]!='o' && ch[i]!='u'){
                System.out.print(ch[i]);
            }
        }
        scan.close();
    }
}
