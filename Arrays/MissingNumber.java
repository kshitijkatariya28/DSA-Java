package Arrays;

// Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.

public class MissingNumber {
    static int missingNumber(int arr[]){
        int N = arr.length +1;
       int xor1=0; int xor2=0;
       for (int i = 0; i < N-1; i++) {
           xor2 = xor2 ^ arr[i];
           xor1=xor1^(i+1);
       }
       xor1 = xor1^N;

      return xor1^xor2;
    }
    public static void main(String[] args) {
        int arr []={1,2,3,4,5,7};
        System.out.println(missingNumber(arr));
    }
}
