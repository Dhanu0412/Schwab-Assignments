/*
 * 2.	String minimization: Problem statement 
 * You are given a string made of lowercase English letters a, b, and c.  
 * Your task is to minimize the length of the string by applying the following operation on the string:  
 * •	for code test execution consider the ‘aabcccabba’ example as a string value. 
 * 1.	Divide the string into two non-empty parts, left and right part. 
 * 2.	Without reversing any of the parts, swap them with each other by appending the left part to the end of the right part. 
 * 3.	While appending, if the suffix string of the right part and the prefix string of the left part contain the same character, then you can remove those characters from the suffix and prefix of the right and left part respectively.  
 * 4.	Repeat the second step until you do not find such prefix and suffix strings. 
 * Determine the minimum length of the string after applying the above operations exactly once on a string. 
 */
import java.util.Scanner;

public class MinLengthString {

	public static void main(String[] args) {
		
		String s;
		System.out.println("Enter the string to find out the minimum length after removing substrings");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		int i=0;
		int j=s.length()-1;
		while(i<j && s.charAt(i)==s.charAt(j)) {
			char d = s.charAt(i);
			while(i<=j && s.charAt(i)==d)
				i++;
			while(i<=j && s.charAt(j)==d)
				j--;
		}
		int minLen=j-i+1;
		System.out.println("Minimum length is " + minLen);
	}

}
