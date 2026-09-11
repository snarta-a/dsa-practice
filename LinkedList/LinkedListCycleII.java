package Linkedlist;
public class LinkedListCycleII {
    static class Node {
        int data;
        Node next;

        Node (int data){
             this.data = data;
             this.next = null;
        }
    }
    static Node detectCycle (Node head ){
        //find the meeting point 
         

        Node slow = head ;
        Node fast = head ;
        
        while (fast != null && fast.next != null){

            // slow moves step 1 
            slow = slow.next;

            // fast moves 2 steps 
            fast = fast.next.next;

            //they meet inside the cycle 

            if (slow == fast){
                break;
            }
        }
        //No cycle 

        if (fast == null || fast.next == null){
            return null;
        }

        // step 2: find cycle begining 

        slow = head ;

        while(slow!= fast){
            // Both move 1 step
            slow = slow.next;
            fast = fast.next;
        }

        //this is the beginning of cycle

        return slow ;
    }
     public static void main(String[] args) {

        // Create nodes
        Node head = new Node(3);
        Node second = new Node(2);
        Node third = new Node(0);
        Node fourth = new Node(-4);

        // Connect nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Create cycle
        fourth.next = second;

        // Find cycle starting node
        Node result = detectCycle(head);

        if (result != null) {
            System.out.println("Cycle starts at: " + result.data);
        } else {
            System.out.println("No cycle");
        }
    }
}





