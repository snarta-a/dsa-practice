package Linkedlist;
public class HappyNumber {
    //function to find the next number 
    //sum of squares of digits 

    static int fun (int n ){

        int sum = 0;
        while( n> 0){
            int digit = n % 10;
            sum = sum + digit * digit ;
            n= n/10;
        }
        return sum ;
    }

    //check weather number is happy 

    static boolean isHappy(int n){
         //Slow and fast pointer start from n 

         int slow = n ;
         int fast = n ;
         //continue until fast reaches 1 

         while (fast != 1 ){
             
            //slow move 1 step
            slow = fun(slow);
            //fast move 2 steps

            fast = fun (fast);
            fast = fun (fast);

            //cycle found and it is not 1 

            if (slow == fast && slow != 1){
                return false;
            }
        }
         
        //fast reached 1 

        return true ;
    }

    public static void main (String [] args ){

        int n = 19;

        boolean result = isHappy(n);

        System.out.println("Is " + n + " a happy Number ? " + result);
    }
}