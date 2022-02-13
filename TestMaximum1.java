package com.Bridgelabz.GenericProgram;
import java.util.*;
public class TestMaximum1{
	
	public int findMaxInteger(int x,int y,int z) {
	
		int max = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println("The maximum number is : "+ max);
		return 0;
	}
	
	public static void main(String[] args) {
		
		TestMaximum1 max = new TestMaximum1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 3 integer values : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		max.findMaxInteger(x,y,z);
	}
}