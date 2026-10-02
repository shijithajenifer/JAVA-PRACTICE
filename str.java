import java.util.*;
public class str {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine();
        char[] ch=str1.toCharArray();
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z') {
                count1++;
            }
            else if(ch[i]>='A' && ch[i]<='Z') {
                count2++;
            }
            else if(ch[i]>='0' && ch[i]<='9') {
                count3++;
            }
            else if(ch[i]==' ') {
                count4++;
            }
            else {
                count5++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);
        scan.close();
    }
}
