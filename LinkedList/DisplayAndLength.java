package LinkedList;

public class DisplayAndLength {

    // display linkedlist
    static void displayRecursion(Node head){
        Node temp = head;
        if(temp==null)return;
        System.out.print(temp.data + " ");
        displayRecursion(temp.next);
        }
    

    static void displayLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    //length of linkedlist
    static int length(Node head){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static class Node{
    int data;
    Node next;
     
    Node(int data){
        this.data=data;
    }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        a.next = b;
        b.next = c;
        displayLL(a);
        System.out.println();
        displayRecursion(a);
        System.out.println(); 
        System.out.print("length ");
        System.out.print( length(a));
    }
}
