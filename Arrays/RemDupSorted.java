package Arrays;

public class RemDupSorted {
    static int removeDuplicate(int []arr){
        if(arr.length==0){
            return 0;
        }
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.print("After removing duplicate :");
        for (int j = 0; j < i+1; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
          return i+1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2};
        System.out.println(removeDuplicate(arr));
    }
}
