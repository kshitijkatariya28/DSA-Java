package LinkedList;

public class Implementation {
    public static class Node{
    int data;
    Node next;
     
    Node(int data){
        this.data=data;
    }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;
      
        //deleetion
        void deleteAt(int pos){
            if(pos==0){
                head = head.next;
            }
            Node temp = head;
            for (int i = 1; i <= pos-1; i++) {
                temp = temp.next;
            }
            if(pos==size()-1){
                tail = temp;
            }
            temp.next = temp.next.next;
        }
         
        //insertion
        void insertAtMiddle(int data,int pos){
           if(pos<0 || pos>size()){
            System.out.println("invalid position");
            return;
           }
           else if(pos==0){
            insertAtStart(data);
            return;
           }
           else if(pos==size()){
            insertAtEnd(data);
            return;
           }
           else{
               Node temp = head;
               for (int i = 0; i < pos-1; i++) {
                  temp = temp.next;
               }
               Node newNode = new Node(data);
               newNode.next = temp.next;
               temp.next = newNode;
           }
        }

        void insertAtStart(int data){
            Node temp = new Node(data);
            if(head==null){
                head = temp;
                tail =temp;
            }else{
                temp.next = head;
                head = temp;
            }
        }
        
        void insertAtEnd(int data){
           Node temp = new Node(data);
           if(head==null){
                head = temp;
           }else{
            tail.next = temp;
           }
           tail = temp;
        }
        
        //get at
        int getAt(int pos){
            Node temp = head;
            for (int i = 0; i < pos; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    
        //display
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        
        //size
        int size(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
        }
        return count;
       }
    }
    public static void main(String[] args) {
         linkedlist ll = new linkedlist();
         ll.insertAtEnd(5);
         ll.insertAtEnd(6);
         ll.insertAtEnd(7);
         ll.insertAtStart(4);
         ll.insertAtMiddle(3, 0);
         ll.display();
         System.out.println();
         ll.deleteAt(3);
         ll.display();
    }
}
