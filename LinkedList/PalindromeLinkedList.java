package Linkedlist;

public class PalindromeLinkedList {
    
    //Node class 
    static class Node {

        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //Function to check pallindrome 
    static boolean isPalindrome(Node head){

        //STEP 1 : find the middle 

        Node slow = head ;
        Node fast = head ;

        while (fast != null && fast.next !=null){

            //slow move 1 step
            slow = slow.next;
            //Fast move 2 step
            fast = fast.next.next;
        }

        //STEP 2: Reverse the second half 

        Node prev = null;

        while (slow != null){
            Node next = slow.next;
            slow.next = prev;
            prev = slow ;
            slow = next ;
        }

        //STEP 3: compare both halves 

        Node firstHalf = head ;
        Node secondHalf = prev ;
        while (secondHalf != null){
            if(firstHalf.data != secondHalf.data){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf =  secondHalf.next;
        }
        return true ;
    }
    public static void main (String [] args ){
         //create linked List
         Node head = new Node (1);
         head.next = new Node (2);
         head.next.next = new Node (2);
         head.next.next.next = new Node (1);


         //Check pallindrome 
         boolean  result = isPalindrome(head);

         //print result
         System.out.println("Is Palindrome : " + result);
    }
}
