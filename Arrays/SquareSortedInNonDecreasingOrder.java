package Arrays;

public class SquareSortedInNonDecreasingOrder {
    static int[] squareSorted(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int left =0;
        int right = n-1;
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
               ans[k++]=arr[left] *arr[left];
               left++;
            }else{
                ans[k++]=arr[right] *arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-10,-5,3,7,8,9};
        int ans[] = squareSorted(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        
    }
}
