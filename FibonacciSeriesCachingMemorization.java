/*
 * 3.	Fibonacci series (solution) 
 * Write a simple Java program which will print Fibonacci series, 
 * e.g. 1 1 2 3 5 8 13 ... . up to a given number.  
 * Be prepared and expect a cross questions like using iteration over recursion 
 * and how to optimize the solution using caching and memorization 
 */
import java.util.Scanner;

public class FibonacciSeriesCachingMemorization {

	static int []cache = new int [1000];
	public static int fib(int n) {
		if(n<=1) 
			return n;
		if(cache[n]!=0)
			return cache[n];
		else {
			cache[n]=fib(n-1)+fib(n-2);
			return cache[n];
		}
	}
	public static void main(String[] args) {
		int n,sum;
		boolean a = true;
		while (a) {
			System.out.println("Menu \n1. To find fibonacci series \n2.Exit");
			Scanner sc = new Scanner(System.in);
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter the number to find the fibonacci series(Caching)");
				n = sc.nextInt();
				System.out.print("The Fibonacci Series is ");
				cache[1]=1;
				sum = fib(n);
				for(int i=1; i<=n; i++) {
					System.out.print(cache[i] + " ");
				}
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
