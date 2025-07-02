package Recursion;

import java.util.Scanner;

public class Print_N_1 {
    static void printDecreasing(int i,int n){
        if(i>n){
            return;
        }else{
            printDecreasing(i+1,n);
            System.out.print(i +" ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(1,n);
        sc.close();
    }
}
