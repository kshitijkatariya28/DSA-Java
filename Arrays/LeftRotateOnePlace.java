package Arrays;

public class LeftRotateOnePlace {
    static void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void leftRotateOnePlace(int []arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
    public static void main(String[] args) {
        int arr[]={100,2,3,45,6,5,9};
        leftRotateOnePlace(arr);
        display(arr);
    }
}
