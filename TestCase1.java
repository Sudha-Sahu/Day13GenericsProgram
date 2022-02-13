package com.Bridgelabz.GenericProgram;
import java.util.*;
public class TestCase1{
	
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

        }
}