package ArrayList;

import java.util.ArrayList;

public class Reverse{
static void reverseList(ArrayList<Integer> list){
   int i=0; int j= list.size()-1;

   while(i<j){
     Integer temp = list.get(i);
     list.set(i,list.get(j));
     list.set(j,temp);
     i++;
     j--;
   }
}
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        System.out.println(l1);
        reverseList(l1);
        System.out.println(l1);
    }
}