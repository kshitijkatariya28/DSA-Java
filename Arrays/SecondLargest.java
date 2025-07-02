package Arrays;

public class SecondLargest {
    static int secondLargest(int []arr){
        int largest =arr[0];
        int snlargest = -1;
      for (int i = 1; i < arr.length; i++) {
        if(arr[i]>largest){
            snlargest=largest;
            largest=arr[i];
        }else if(arr[i]<largest && arr[i]>snlargest){
            snlargest=arr[i];
        }
      }
      return snlargest;
    }
    public static void main(String[] args) {
        int arr[]={2,5,7,7,9,2};
        System.out.println(secondLargest(arr));;
    }
}
