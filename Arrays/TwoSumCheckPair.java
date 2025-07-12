package Arrays;

public class TwoSumCheckPair {
    static boolean checkPair(int arr[],int k){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==k){
                    return true;
                }
            }
        }
       return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,-1,0,3,2,5,7};
        System.out.println(checkPair(arr, 8));
    }
}
