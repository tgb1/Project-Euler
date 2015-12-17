/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Artisto
 */
public class Problem010 {
    /**
     * Sum of primes below 2 * 10^6
     */
    
    public static void main(String[] args){
        long sum = 0L;
        
        for (int x = 2; x < 2000000; x++) {
            if(isPrime(x))
                sum += x;
        }
        
        System.out.println(sum);
    }
    
    public static boolean isPrime(int n){
        if(n > 2 && (n & 1) == 0)
            return false;
        
        for(int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
}
