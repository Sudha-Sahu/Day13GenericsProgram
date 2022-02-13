package com.Bridgelabz.GenericProgram;
import java.util.*;
public class TestCase2{
	
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
            
            Integer[] numbers = {40, 60, 30};
            System.out.println("Max no. at position 2nd: " +max(numbers));
        }
}