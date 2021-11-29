/*
 * 3.	Fibonacci series (solution) 
 * Write a simple Java program which will print Fibonacci series, 
 * e.g. 1 1 2 3 5 8 13 ... . up to a given number.  
 * Be prepared and expect a cross questions like using iteration over recursion 
 * and how to optimize the solution using caching and memorization 
 */
import java.util.Scanner;

public class FibonacciSeriesRecursion {

	static int x = 0, y = 1, sum = 0;

	public static void fib(int n) {
		if (n-1 > 0) {
			sum = x + y;
			x = y;
			y = sum;
			System.out.print(" " + sum);
			fib(n - 1);
		}
	}

	public static void main(String[] args) {
		int n;
		boolean a = true;
		while (a) {
			System.out.println("Menu \n1. To find fibonacci series \n2.Exit");
			Scanner sc = new Scanner(System.in);
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter the number to find the fibonacci series(Recursion)");
				n = sc.nextInt();
				System.out.print("The Fibonacci Series is " + y);
				fib(n);
				System.out.println("\n");
				break;
			case 2:
				a = false;
				break;
			default:
				System.out.println("Please enter a valid choice!!!!!!!\n");
				break;
			}
		}
		
	}

}
