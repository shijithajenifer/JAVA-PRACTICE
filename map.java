import java.util.Map;
import java.util.HashSet;
import java.util.*;
public class map {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        char[] arr=s.toCharArray();
        int n=arr.length;
        String s2="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++){
            System.out.print(map.get(arr[i]));
        }
    }
}
