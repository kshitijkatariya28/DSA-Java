package Arrays;

public class LinearSearch {
    static int linearSearch(int arr[],int value){
        int temp=value;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==temp){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {1,3,64,6,6,7,8};
        System.out.println(linearSearch(arr,8 ));;
    }
}
