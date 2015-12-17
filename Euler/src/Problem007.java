/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Artisto
 */
public class Problem007 {
    /**
     * Find the 10,001st prime
     * One is not considered a prime in the example
     */
    
    public static void main(String[] args){
        int counter = 3;
        int primes = 2;
        
        while(primes <= 10001){
            if(isPrimeNumber(counter)){                           
                System.out.println(primes + ". " + counter);
                primes ++;
                counter += 2;
            } else {
                counter += 2;
            }
        }
    }
    
    
    // Hi there old friend
    public static boolean isPrimeNumber(int n){
        if(n > 2 && (n & 1) == 0)
            return false;
        
        for(int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
}
