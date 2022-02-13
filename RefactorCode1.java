package com.Bridgelabz.GenericProgram;
import java.util.*;
public class RefactorCode1{
	
	public static <T extends Comparable<T>> T max(T[] elements) {
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
        public static void main(String args[]) {
   
        	Integer[] numbers = {41, 21, 31};
            System.out.println("Max no. at position 1st: " +max(numbers));

            Double[] num = {4.60, 2.52, 3.51};
            System.out.println("Max no. at position 1st: " + max(num));
            
        	String[] words = {"pear", "apple", "banana"}; 
            System.out.println("Max string at position 1st: "+max(words));
        }
}