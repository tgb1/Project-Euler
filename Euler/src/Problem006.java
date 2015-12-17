/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Artisto
 */
public class Problem006 {
    /**
     * Square of the sum - sum of the squares
     */
    
    public static void main(String[] args){
        // Find the difference
        System.out.println(sumSquared(1, 100) - sumOfTheSquares(1, 100));
    }
    
    public static int sumOfTheSquares(int start, int end){
        int sumOfTheSquares = 0;
        
        
        // Do some magic
        for (int x = start; x <= end; x++) {
            sumOfTheSquares += x * x;
        }
        
        // TEST
        System.out.println(sumOfTheSquares);
        
        return sumOfTheSquares;
    }
    
    public static int sumSquared(int start, int end){
        int sumSquared = 0;
        
        // Get the sum
        for (int x = start; x <= end; x++) {
          sumSquared += x;  
        }
        
        // TEST
        System.out.println(sumSquared);
        
        // Get the squared value
        sumSquared *= sumSquared;
        
        return sumSquared;
    }
}
