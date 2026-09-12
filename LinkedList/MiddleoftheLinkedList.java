package Linkedlist;

public class MiddleoftheLinkedList {
    // Node class
    static class Node {
        int data ;
        Node next;

        Node(int data ){
            this.data = data;
            this.next = null;
        }
    }

    //Function to find the middle node 

    static Node findMiddle(Node head){

        //Slow starts from head 
        Node slow = head ;

        //Fast also start from head 

        Node fast = head;

        //Slow move 1 step 
        // Fast moves 2 step 

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }

        //Slow is the midddle 
        return slow;
    }
    public static void main (String [] args){

        // Create linked list 
        Node head = new Node (1);

        head.next = new Node (2);
        head.next.next = new Node (3);
        head.next.next.next = new Node (4);
         head.next.next.next.next = new Node (5);
    
         //Find middle 
         Node middle = findMiddle(head);

         //print middle 
         System.out.println("Middle node : "+middle.data);
    }
}
