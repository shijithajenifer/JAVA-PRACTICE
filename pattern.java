public class pattern {
    public static void main(String[] args){
        /*for(int i=0;i<5;i++){
            for(int k= 0;k<5;k++){
                System.out.print(" ");
                /*if(i==0 || i==4 || j==0 || j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
       int n=5;
       for(int i=0;i<n;i++){
          for(int j=1;j<n-i;j++){
            System.out.print(" ");
          }
          for(int k=1;k<=n;k++){
            System.out.print("*");
          }
          System.out.println();
       }
    }
}
