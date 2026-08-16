import java.util.*;
public class list1 {

    public static void main(String[] args){
        /*Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();*/
        ArrayList <Integer> list = new ArrayList<>();
        /*for(int i=0;i<n;i++){
            list.add(scan.nextInt());
        }
        System.out.print(list);
        /*list.add(60);
        list.add(40);
        list.add(20);
        System.out.print(n);
        scan.close();*/
        list.add(20);
        list.add(40);
        list.add(60);
        System.out.print(list.get(1));
        list.set( 0, 50);
        list.remove(2);
        list.size();
