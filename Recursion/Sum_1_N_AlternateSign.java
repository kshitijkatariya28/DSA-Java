package Recursion;

public class Sum_1_N_AlternateSign {
    static int sumAlternate(int num){
        if(num==0){
            return 0;
        }
        if(num%2==0){
            return sumAlternate(num-1)-num;
        }else{
            return  sumAlternate(num-1)+num;
        }
    }
    public static void main(String[] args) {
        System.out.println(sumAlternate(5));;
    }
}
