package Arrays;

public class Sort_0s_And_1s {
    static void sort(int arr[]){
        int left=0;
        int n = arr.length;
        int right = n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                arr[left]=0;
                arr[right]=1;
                left++;
                right--;
            }

            if(arr[left]==0){
                left++;
            }

            if(arr[right]==1){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr [] ={1,1,0,0,0,1,1,0,1,1,0,0};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
