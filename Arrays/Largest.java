package Arrays;

public class Largest {
    static void printLargest(int []arr){
        int largest=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int arr[]={4,6,3,8,0};
        printLargest(arr);
    }
}
