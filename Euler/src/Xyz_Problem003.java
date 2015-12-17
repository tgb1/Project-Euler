
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Artisto
 */
public class Xyz_Problem003 {
    /**
     * Prime factors of 600851475143
     */
    
    public static void main(String[] args){
        ArrayList primes = new ArrayList();
        BigInteger importantNumber = new BigInteger("600851475143");
        BigDecimal biggestDecimal = new BigDecimal(importantNumber);
        
        BigDecimal test = BigDecimal.valueOf(4);
        
        primes = getAllPrimes(biggestDecimal);
        
        //Write to textfile
        writeToText(primes);
    }
    
    public static void writeToText(ArrayList a){
        try{
            PrintWriter pr = new PrintWriter("primes.txt", "UTF-8");
            
            for (Object n : a){
                pr.println(n);
            }
            
            pr.close();
        } catch(Exception e) {
            System.out.println("oops something file");
        }
    }
    
    public static ArrayList getAllPrimes(BigDecimal iN){
        ArrayList<BigDecimal> primes = new ArrayList();
        BigDecimal half = iN.divide(BigDecimal.valueOf(2));
        BigDecimal ii = new BigDecimal("1");
        
        for (BigDecimal i = ii; i.compareTo(half) < 0; i = i.add(BigDecimal.valueOf(2))) {
            if(isPrime(i)){
                primes.add(i);
                //System.out.println(i + " is a prime");
            }            
        }
        
        return primes;
    }
    
    // Rewrite old friend to understand BigDecimal
    public static boolean isPrime(BigDecimal n){
        if(n.compareTo(BigDecimal.valueOf(2)) == 0)
            return true;
        
        if(n.remainder(BigDecimal.valueOf(2)).compareTo(BigDecimal.ZERO) == 0)
            return false;
        
        for(BigDecimal i = BigDecimal.valueOf(3); i.compareTo(n) <= 0; i = i.add(BigDecimal.valueOf(2)))
            if (n.remainder(i).compareTo(BigDecimal.ZERO) == 0)
                return false;
        return true;
    }
}
