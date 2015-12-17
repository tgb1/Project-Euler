
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
public class Problem003 {
    /**
     * Prime factors of 600851475143
     */
    
    public static void main(String[] args){        
        ArrayList primesList = new ArrayList();
        
        // Create some primes
        long big = 600851475143L;
        primesList = getPrimes(10000);
        
        getPrimeFactors(big, primesList);
        //testArray(primesList);
    }
    
    public static void getPrimeFactors(long n, ArrayList p){
        String primeFactors = "";
        
        outerloop:
        while(!isPrimeNumber(n)){
            for(Object primeNumber : p){
                if(n % (int)primeNumber == 0){
                    primeFactors += primeNumber + " ";
                    
                    n = n / (int)primeNumber;
                    
                    if(isPrimeNumber(n)){
                        primeFactors += n;
                        break outerloop;
                    }
                }
            }
        }
        
        System.out.println(primeFactors);
    }
    
    public static void testArray(ArrayList a){
        for(Object n : a){
            System.out.println((int) n);
        }
    }
    
    public static ArrayList getPrimes(int n){
        ArrayList primes = new ArrayList();
        
        for (int x = 2; x < n; x++) {
            if(isPrimeNumber(x)){
                primes.add(x);
            }
        }
        
        return primes;
    }
    
    public static boolean isPrimeNumber(long n){
        if(n > 2 && (n & 1) == 0)
            return false;
        
        for(int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
}
