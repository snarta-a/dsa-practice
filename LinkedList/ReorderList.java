package Linkedlist;

public class ReorderList {

    //Node class

    static class Node {

        int data ;
        Node next;

        Node (int data ){
            this.data = data;
            this.next = null;
        }
    }
    //Function  to reorder the Linked list 
    static void reorderList(Node head){

        //STEP 1 : Find the middle 

        Node slow  = head ;
        Node fast = head ;

        while  (fast != null && fast.next != null){

            //Slow moves 1 step
            slow = slow.next;

            //fast moves 2 steps
            fast = fast.next.next;
        }

        //STEP 2 : Reverse the second half
        Node prev = null;
        while (slow != null){
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        //STEP 3: Merge both halves 
        Node first = head ;
        Node second = prev;

        while(second.next != null){

            //Save next nodes 

            Node firstNext = first.next;
            Node secondNext = second.next;

            //Connect first node to second node 
            first.next = second ;

            //Connect second node to next first  node 
            second.next = firstNext;

            //Move forward 

            first = firstNext;
            second = secondNext;
        }
    }


    //Function to print Linked List 

    static void printList (Node head ){
        Node current = head ;

        while(current != null){
            System.out.print(current.data + "-> ");
            current = current.next;
        }

        System.out.println("null");

}
public static void main (String[] args ){

     //Create linked list 
     Node head = new  Node (1);

     head.next = new Node(2);
     head.next.next = new Node  (3);
     head.next.next.next= new Node(4);

    System.out.println("Before Reorder :");
    printList (head );

    //Reorder the list
    reorderList(head);

    System.out.println("After reorder:");
    printList(head);
}
}