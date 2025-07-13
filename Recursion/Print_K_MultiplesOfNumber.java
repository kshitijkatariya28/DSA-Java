package Recursion;

public class Print_K_MultiplesOfNumber {
    static void print_K_Multiple(int num,int k){
          if(k==0){
            return ;
          }else{
          print_K_Multiple(num, k-1); 
          System.out.print(num * k + " ");
          }
          
    }
    public static void main(String[] args) {
        print_K_Multiple(3,5);
    }
}