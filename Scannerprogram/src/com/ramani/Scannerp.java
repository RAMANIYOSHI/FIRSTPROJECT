package com.ramani;
import java.util.Scanner;
public class Scannerp {

	public static void main(String[] args) {
		
		System.out.println("Enter your details....");

	    //scanner object
	    Scanner input = new Scanner(System.in);

	    //take input name is string
	    System.out.println("Please enter your name: ");
	    String student_name = input.nextLine();
	    System.out.println("Please enter your initial in single character: ");
	    char name = input.next().charAt(0);
	    

	    //take input age is integer type
	    System.out.println("Enter your age: ");
	    int age = input.nextInt();
	    

	    //take input cgpa is double type
	    System.out.println("Enter your cgpa: ");
	    double cgpa = input.nextDouble();
	    System.out.println("Name- " + student_name+"."+name);
	    System.out.println("Age- " + age);

	    System.out.println("cgpa- " + cgpa);
	    //close the scanner
	    input.close();
	}
}