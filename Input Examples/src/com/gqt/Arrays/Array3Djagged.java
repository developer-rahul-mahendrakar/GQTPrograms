/**
 * 
 */
package com.gqt.Arrays;

import java.util.Scanner;

/**
 * @author Rahul
 * description : This is a code for demonstration of 3 Dimensional Jagged Array
 * @requirement To store marks of n students from m classrooms of o colleges
 * 
 * College		0	      1	            2
 * Classrooms 0	  1   0   1   2   3   0   1   2
 * Students	  1   2   3   4   2   2   2   1   3
 */
public class Array3Djagged {

	/**
	 * @param args
	 * @param sc
	 * @param arr
	 * @param n
	 * @param m
	 * @param o
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Count of College : ");
		int m = sc.nextInt();
		
		int arr[][][] = new int [m][][];
		
		// Collecting Class count
		for (int i=0; i<arr.length; i++) {
			System.out.println("Enter the total number of classrooms in college : " +(i+1));
			arr[i] = new int [sc.nextInt()][];
		}
		// Collecting the student count
		for (int i=0; i<arr.length; i++) {
			System.out.println("Inside College - " +(i+1));
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the total number of students in classroom - " +(j+1));
				arr[i][j] = new int[sc.nextInt()];
			}
		}
		// Code for Collecting Marks
		for (int i=0; i<arr.length; i++) {
			System.out.println("Inside the College - " +(i+1));
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("Inside the Class - " +(j+1));
				for (int k=0; k<arr[i][j].length; k++) {
					System.out.println("Enter the marks of Student - " +(k+1));
					arr[i][j][k] = sc.nextInt();
			}
		}
	}
		// Code for Printing marks
		for (int i=0; i<arr.length; i++) {
			System.out.println("Inside the College - " +(i+1));
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("Inside the Class - " +(j+1));
				for (int k=0; k<arr[i][j].length; k++) {
					System.out.println("The student - " +(k+1)+"Marks is : "+arr[i][j][k]);
				}
			}
		}
	}
		

}
