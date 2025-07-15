package Recursion;
import java.util.*;

public class MyPow {
     static double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        return x * myPow(x,n-1);
    }
    public static void main(String[] args) {
        double ans = myPow(2,2);
        System.out.println(ans);
    }
}
