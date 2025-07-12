package Arrays;

//Given N array elements,count total no of elements having atleast 1 element greater than itself

public class OneElementGreaterItself {
    static int maxElement(int arr[]){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int greaterIself(int arr[]){
        int count = 0;
        int max = maxElement(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max){
                count++;
            }
        }
        return arr.length-count;
    }
    public static void main(String []args){
       int arr[]={1,5,5,7,8,6,6,7,6,7};
       System.out.println(greaterIself(arr));
    }
}
