/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Artisto
 */
public class Problem009 {
    /**
     * Pythagorean triplets
     * a + b + c = 1000
     * a < b < c
     */
    
    public static void main(String[] args){
        //System.out.println(isPythagorean(3, 4, 5));
        
        int b = 2;
        int c = 997;
        int difference = 1000 - c;
        
        loop:
        while(c > b){
            int a = 1;
            b = difference - 1;
            
            while(b > a){
                if(isPythagorean(a, b, c)){
                    System.out.println("Gotcha: a = " + a + " b = " + b + " c = " + c);
                    break loop;
                }
                b--;
                a++;
            }
            c--;
            difference = 1000 - c;
        }
    }
    
    public static boolean isPythagorean(int a, int b, int c){
        if(a*a + b*b == c*c)
            return true;
        
        return false;
    }
}
