package Recursion;

public class Print_1_N {
    static void printIncreasing(int n){
        if(n<1){
            return;
        }else{
            printIncreasing(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        printIncreasing(5);
    }
}
