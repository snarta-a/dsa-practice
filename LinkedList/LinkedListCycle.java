package Linkedlist;

public class LinkedListCycle {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // function to detect cycle 
    static boolean hasCycle (Node head ){
        Node slow = head;
        Node fast = head ;

    while (fast!= null && fast.next != null ){
        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast){
            return true ;
        }
    }
    return false ;
}
 public static void main(String[] args) {

        // Creating nodes
        Node head = new Node(3);
        Node second = new Node(2);
        Node third = new Node(0);
        Node fourth = new Node(-4);

        // Connecting nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Creating cycle
        fourth.next = second;

        // Check cycle
        boolean result = hasCycle(head);

        System.out.println("Cycle exists: " + result);
    }
}


