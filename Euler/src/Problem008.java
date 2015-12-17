import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
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
public class Problem008 {
    /**
     * Greatest product of 13 adjacent digits
     */
    
    public static void main(String[] args) throws IOException{   
        List<Integer> list = readToList("008.txt");
        
        System.out.println(list);
        System.out.println(list.size());
        
        // Do some magic
        
        int value = 0;
        int counter = 0;
        long highestNumber = 1L;
        long number = 1L;
        String numberString;
        
        loop:
        while(true){
            // Reset the number
            //number = 1;
            
            // TEST
            numberString = "";
            
            int currentCounterValue = counter;
            
            for (int x = counter; x < currentCounterValue + 13; x++) {
                
                
                value = list.get(x);
                
                // The end
                if(value == -1){
                    System.out.println("The end..");
                    break loop;
                }
                
                // Check for zero
                if(value == 0){
                    // TEST
                    System.out.println("Found a zero, counter is at: " + counter + " check: " + list.get(counter));
                    
                    counter++; 
                    number = 1L;
                    
                    break;
                } else {
                    number *= value;
                    System.out.println("CounterValue: " + currentCounterValue + " | Counter: " + counter + " | Looped: " + (counter - currentCounterValue) + " | Number: " + number);
                    // TEST add number to string
                    numberString += Integer.toString(value);
                    
                    // Found 4 digits on a row
                    if(counter == currentCounterValue + 12){
                        // Check to see if it is the highest number
                        if(number > highestNumber){
                            highestNumber = number;
                            
                            // TEST
                            System.out.println();
                            System.out.println("Starts at: " + currentCounterValue);
                            System.out.println("Number String:  " + numberString);
                            System.out.println("New highest number found: " + highestNumber);
                            System.out.println();
                            
                            number = 1L;
                        }
                        
                        // If the next value isn't a zero ge the number of the next four integers
                        if(list.get(x + 1) != 0){
                            counter -= 12;
                            
                            number = 1L;
                        } else {
                            // Next number is a zero so we can skip one
                            counter++;
                            
                            //TEST                            
                            System.out.println("Found a zero, counter is at: " + counter + " check: " + list.get(counter) + " -skip");
                            
                            number = 1L;
                        }
                    }                   
                    
                    counter++;
                }
            }
        }
        
        System.out.println(highestNumber);
        System.out.println(list.get(49));
    }
    
    // Put the number into a list
    public static List<Integer> readToList(String path) throws IOException{
        List<Integer> list = new ArrayList<Integer>();
        
        try(Reader reader = Files.newBufferedReader(Paths.get(path))){
            int c = 0;
            while((c = reader.read()) != -1){
                char ch = (char) c;
                int value = Character.getNumericValue(ch);
                if(value >= 0){
                    list.add(value);
                }
            }
        }
        
        // Mark the end of the list
        list.add(-1);
        
        return list;
    }
}
