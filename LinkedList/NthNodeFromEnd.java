package LinkedList;

public class NthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    static int size(Node head){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
           temp = temp.next;
        }
        return count;
    }

    //Optimize
    static Node nthNodeOptimize(Node head, int idx){
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= idx; i++) {
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    //Brute force
    static Node nthNode(Node head,int idx){
        Node temp = head;
        int size = size(temp);
        for (int i = 1; i < size-idx+1; i++) { //main logic
            temp =temp.next;
        }
         return temp;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(10);
        
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        System.out.println(size(a));

        Node returnedNode = nthNodeOptimize(a ,1);
        System.out.println(returnedNode.data);
    }
}
