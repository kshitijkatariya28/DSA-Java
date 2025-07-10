package Arrays;

// Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

public class CountMaximumConsecutiveOnes {
    static int maximumConsecutiveOnes(int []arr){
        int count=0;
        int maxCount=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
               count++;
            }else{
                count = 0;
            }
            maxCount=Math.max(maxCount,count);
        }
       return maxCount;
    }
    public static void main(String[] args) {
        int arr[]= {1,1,0,0,1,1,1,1,0,0};
        System.out.println(maximumConsecutiveOnes(arr));;
    }
}
