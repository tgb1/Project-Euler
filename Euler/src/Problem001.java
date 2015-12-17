
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
public class Problem001 {
    /**
     * Get the sum of the numbers that are < 1000
     * AND divisible by 3 || 5
     */
    
    public static void main(String[] args){
        // Create list
        ArrayList numbers = new ArrayList(getNumbers());
        
        // Get the sum
        int result = getSum(numbers);
        
        // Did it work?
        System.out.println(result);
    }
    
    public static ArrayList<Integer> getNumbers(){
        ArrayList list = new ArrayList();
        
        // Check if numbers are divisible by 3 or 5
        
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                list.add(i);
            }
        }
        
        return list;
    }
    
    public static int getSum(ArrayList a){
        int total = 0;
        
        for (Object n : a) {
            total += (int) n;
        }
        
        return total;
    }
}
