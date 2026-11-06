/**
 * November 6 class workspace for the Iteration 3 driver plan.
 * Write the class pseudocode in main as comments, then commit and push progress.
 * This file does not replace breakCode in your existing CodeBreakers3.java.
 */
public class KeySearchPlan {
    public static void main(String[] args) {
        int count = 0;
        /*Possible orders: 
        CKR   CRK   KCR   KRC   RCK   RKC

        How many possible C shifts are there? (that are unique and non-equivalent) 
        26
        
        How many possible K shifts are there? (that are unique and non-equivalent) 
        ~ 2,000 (-999 through 999)
        
        How many possible R shifts are there? (that are unique and non-equivalent) 
        just 1!*/

        //below, loop through all the possibilities of encryption keys and print out each, and the total count. 
        for (int c = 0; c < 26 ; c++){ 
            for (int k = -999;  k < 1000; k++ ){
                // compute each of CKR   CRK   KCR   KRC   RCK   RKC
                count+= 6;
            }
        }
        System.out.print(count);
    }
}
