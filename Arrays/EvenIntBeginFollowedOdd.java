package Arrays;

public class EvenIntBeginFollowedOdd {
    static void swap(int []arr,int start,int end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]=temp;   
        }

    static void evenBegin(int arr[]){
        int left=0;
        int right= arr.length-1;

        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                 swap(arr, left, right);
            }

            if(arr[left]%2==0){
                left++;
            }

            if(arr[right]%2!=0){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,8,9,3,4,5,2,2,4,4,8};
        evenBegin(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
