
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Artisto
 */
public class Problem004 {
    /**
     * Largest Palindrome three digit multiplication
     */
    
    public static void main(String[] args){
        ArrayList a = new ArrayList();
        
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int product = i * j;
                if(isPalindrome(product)){
                    a.add(product);
                    System.out.println(product + " is palindrome");
                }
            }
        }
        
        // Sort the ArrayList
        Collections.sort(a);
        
        int size = a.size();
        
        // Output the last value
        System.out.println(a.get(size - 1));
    }
    
    public static boolean isPalindrome(int n){
        
        // Do some magic
        if(n == reverseNumber(n))
            return true;
        
        return false;
    }
    
    // Reverse the number
    public static int reverseNumber(int n){
        int reversed = 0;
        
        // Get length of the number
        int length = determineLength(n);
        
        // Get the factor
        int factor = getFactor(length);
        
        // Do some magic
        while(n >= 1){
            int remainder = n % 10;
            reversed += remainder * factor;
            factor /= 10;
            n /= 10;
        }        
        
        return reversed;
    }
    
    // Calculate factor based on amount of decimals
    public static int getFactor(int n){
        int factor = 1;
        
        for (int x = 1; x < n; x++) {
            factor *= 10;
        }
        
        return factor;
    }
    
    // Determine the length of the number
    public static int determineLength(int n){
        int length = 0;
        
        // Do some magic
        while(n >= 1){
            if(n == 1){
                length++;
                break;
            }
            
            n /= 10;
            length++;
        }
        
        return length;
    }
}
