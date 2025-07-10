package Arrays;

// Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one

public class NumberAppearsOnceOtherTwice {
    static int numberAppearOnce(int arr[]){
        int xor=0;
      
        for (int i = 0; i < arr.length; i++) {
            xor=xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,4,6,6,7,4,5,5};
        System.out.println(numberAppearOnce(arr));
    }
}
