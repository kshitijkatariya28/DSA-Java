import java.util.Scanner;

public class Tri0and1 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of rows and column");
    int m=sc.nextInt();
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= i; j++) {
            if((i%2!=0)&&(j%2!=0)){
                System.out.print("1"+" ");
            }else if((i%2==0)&&(j%2==0)){
                System.out.print("1"+" ");
            }else{
                System.out.print("0"+" ");
            }
        }
        System.out.println();
    }


    System.out.println("method 2");
  
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= i; j++) {
            if((i+j)%2==0){
                System.out.print("1"+" ");
            }else{
                System.out.print("0"+" ");
            }
        }
        System.out.println();
    }

    sc.close();
}
}
