import java.util.*;
class hashst  {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int val:set){
            System.out.print(val+" ");
        }
     }
}