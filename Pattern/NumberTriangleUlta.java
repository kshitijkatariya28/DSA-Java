import java.util.Scanner;

public class NumberTriangleUlta{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows and column");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("pattern :");
        System.out.println("method 1");
       for (int i = 1; i <= m; i++) 
       {
            for (int j = m; j>= i; j--) 
            {
              System.out.print("*"+" ");
            }
       System.out.println();
       
       }
          
       System.out.println("Method 2");
       for (int i = 1; i <= m; i++) 
       {
            for (int j = 1; j<= n+1-i; j++) 
            {
              System.out.print("*"+" ");
            }
       System.out.println();
       
       }

       sc.close();
}}