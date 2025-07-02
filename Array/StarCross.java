import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows and column");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("pattern :");
        System.out.println("method 1");
       for (int i = 1; i <= m; i++) 
       {      
            for (int j = 1; j<= n; j++) 
            {
              if((i==j)||(i+j==6)){
                System.out.print("* ");
              }else{
                System.out.print(("  "));
              }
          
            }
       System.out.println();
       
       }
       sc.close();
}
}
