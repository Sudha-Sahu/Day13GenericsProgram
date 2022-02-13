package com.Bridgelabz.GenericProgram;

public class FloatMaximum {
    public static <T extends Comparable<T>> T max(T... elements) {
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String args[]) {

        System.out.println("Max no. at position 1st: " + max(4.60, 2.52, 3.51));

        System.out.println("Max no. at position 2nd: " + max(4.60, 6.55, 3.51));

        System.out.println("Max no. at position 3rd: " + max(4.62, 2.555, 8.54));

    }
}
