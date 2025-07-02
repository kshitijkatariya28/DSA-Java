import java.util.Scanner;

public class oddNumTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows and column");
        int m = sc.nextInt();
        //int n = sc.nextInt();
        System.out.println("pattern :");
        System.out.println("method 1");
       for (int i = 1; i <= m; i++) 
       {      
            for (int j = 1; j<= i; j++) 
            {
              System.out.print(2*j-1+" ");
          
            }
       System.out.println();
       
       }
       sc.close();
}
}