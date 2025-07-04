package Arrays;

public class LeftRotate {
    static void display(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
}

    static void swapArray(int []arr,int start,int end){
        int i=start;
        int j=end;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    
    static void leftRotate(int arr[],int d){
        int n = arr.length;
        int i=0;
        d=d%n;
         swapArray(arr,i,d-1);
         swapArray(arr, d, n-1);
         swapArray(arr, i, n-1);

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8};
        leftRotate(arr, 5);
        display(arr);
    }
}
