package Recursion;

public class Sum_1_N {
    static int printSum(int n){
        if(n==0){
            return 0;
        }else{
           return  n+printSum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(printSum(4));
    }
}
