
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
public class Problem002 {
    /**
     * Find the SUM of EVEN Fibonacci numbers that
     * are < 4000000 (4 x 10^6)
     */
    
    public static void main(String[] args){
        int result;
        
        // Create list with Fibonacci numbers
        ArrayList list = new ArrayList(getFibNumbers());
        
        // Get the odd one out
        ArrayList oddOnesAreOut = new ArrayList(oddOneOut(list));
        
        // Get the sum
        result = getSum(oddOnesAreOut);
        
        // Did it work?
        
        // ^ Is not working as intended
        // Fix: Math.pow(x, y)
        
        // Can't iterate through ArrayList and remove at the same time
        // Fix: Convert ArrayList to List
        //      Create Iterator<> i
        //      Use i.hasNext && i.next
        System.out.println(result);
        
        // For test purposes only
        //testArray(list);
    }
    
    // Loop through all values in an Array
    public static void testArray(ArrayList a){
        for(Object n : a){
            System.out.println((int) n);
        }
    }
    
    // Get the numbers
    public static ArrayList getFibNumbers(){
        ArrayList fibNumbers = new ArrayList();
        
        // Add the first two terms
        fibNumbers.add((int) 1);
        fibNumbers.add((int) 2);
        
        // Do some magic
        loop:
        for (int x = 0; x < 999; x++) {
            // Get the last two numbers from the list
            int almostTheLatestNumber = (int) fibNumbers.get(x);
            int theLatestNumber = (int) fibNumbers.get(x + 1);
            
            // Create the new number
            int thisOneIsNew = almostTheLatestNumber + theLatestNumber;
            
            // TRUE: Add to fibNumbers
            // FALSE: End it early
            if (thisOneIsNew <= (4 * Math.pow(10, 6))) {
                fibNumbers.add(thisOneIsNew);
            } else {
                break loop;
            }
        }
        
        return fibNumbers;
    }    
    
    // There are too many numbers
    public static ArrayList oddOneOut(ArrayList a){
        List<Integer> tempList = new ArrayList<>(a);
        Iterator<Integer> i = tempList.iterator();
        
        // Remove the odd numbers with magic
        while(i.hasNext()){
            int n = i.next();
            
            if (n % 2 != 0){
                // Test purpose only
                //System.out.println(n + " is removed");
                
                // Out you go
                i.remove();
            }
        }
        
        ArrayList b = new ArrayList(tempList);
        
        return b;
    }
    
    // Hello there old friend
    public static int getSum(ArrayList a){
        int total = 0;
        
        for (Object n : a) {
            total += (int) n;
        }
        
        return total;
    }
}
