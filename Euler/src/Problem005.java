
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Artisto
 */
public class Problem005 {
    /**
     * Smallest number that is divisible by 1 to 20
     */
    
    public static void main(String[] args){
        System.out.println("Result: " + divisibleByOneToN(20));
    }
    
    public static int divisibleByOneToN(int n){
        int smallest = 0;
        int looper = 0;
        
        outerloop:
        while(smallest == 0){
            int amount = 0;
            
            looper++;
            
            // TEST purpose only
            //System.out.println(looper);
            
            for (int x = n; x > 0; x--) {
                if(looper % x == 0)
                    amount++;
                
                if(amount == n){
                    smallest = looper;
                    break outerloop;
                }
            }
        }
        
        return smallest;
    }
}
