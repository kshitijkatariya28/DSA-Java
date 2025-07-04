package Arrays;

public class MoveZerosEnd {
    static void display(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    
    static void swapArray(int []arr,int start,int end){
        int i=start;
        int j=end;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static int firstZero(int arr[]){
            for (int j = 0; j < arr.length; j++) {
              if(arr[j]==0){
                return j;
              }   
            }
            return -1;
    }

    static void moveZeroes(int arr[]){
        int j = firstZero(arr);
        System.out.println("j"+j);
        for (int i = j+1; i < arr.length; i++) {
            if(arr[i]!=0 && arr[j]==0){
                swapArray(arr,j,i);
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,0,0,6,7,0,0};
        moveZeroes(arr);
         display(arr);
        
    }
}
