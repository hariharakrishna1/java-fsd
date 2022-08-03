package assissted;

import java.util.*;

public class Stackit {
    public static void main(String args[])
    {
  
        // Creating an empty Stack
        Stack<String> stack = new Stack<String>();
  
        stack.add("75th");
        stack.add("Independence");
        stack.add("Day");
        stack.add("Hai");
        stack.add("Hello");
  
       
        System.out.println("Stack: " + stack);
  
        
        String rem_ele = stack.remove(4);
  
  
        System.out.println("Removed element: " + rem_ele);
  
        
        System.out.println("Final Stack: "+ stack);
    }
}
