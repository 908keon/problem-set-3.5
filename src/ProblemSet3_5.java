import java.util.Scanner;

/**
 * INSTRUCTIONS.
 * 
 * The following exercises are, perhaps, more mathematically inclined than previous
 * problem sets. While they might be challenging, they are certainy doable.
 * 
 * You can (and should!) solve each of them using only the operators, conditional control
 * structures, and iterative control strucurs we've covered. You are not permitted to use
 * recursive code in your solutions.
 * 
 * Please be mindful of the expected outputs, as your code will be tested against that
 * directly. If you're unsure, please ask for clarification.
 * 
 * This problem set is worth 25 points and is due no later than 11:59pm on October 28, 2018.
 */

public class ProblemSet3_5 {
	
	public static void main(String[] args) {
		ProblemSet3_5 ps = new ProblemSet3_5();
		
		// test your solutions here
		
		ps.primes(1, 1000);
		ps.leapYears(3);
		ps.palindromicNumbers(454);
		ps.fibonacci(22);
		ps.multiples(2, 3, 10);
	}
	
	/**
	 * How many prime numbers are there between @start and @end, where @start and @end
	 * are positive integers in the range [1, @Integer.MAX_VALUE]?
	 * 
	 * Print your solution in the following formats: "There is X prime number."
	 *                                               "There are X prime numbers."
	 * 
	 * @param start
	 * @param end
	 */
	
	public void primes(int start, int end) {
		boolean prime;
		int primeCount = 0;
		start = start + 1;
			for (int i = start; i < end; i++) {
				prime = true;
				outerLoop:
				for(int j = 2; j <=i/2; j++)
					if(i % j == 0) {
						prime = false;
						break outerLoop;
						}
				if (prime == true) {
					primeCount++;
				}
			}
			if(primeCount== 1) {
				System.out.println("There is " + primeCount + " " + "prime number");
			}
			else if(primeCount > 1) {
				System.out.println("There are " + primeCount + " " + "prime numbers"); 
			}
		}

	/**
	 * What are the next @count leap years?
	 * 
	 * Print your solution in the following formats: "The next leap year is X."
	 *                                               "The next 2 leap years are X and Y."
	 *                                               "THe next N leap years are A, ..., X, Y, and Z."
	 * 
	 * @param count
	 */
	

	public void leapYears(int count) {
		int firstLeap = 2020;
		if (count <= 0) {
			System.out.println("I Don't know how to compute the next " + count + " leap years...");
		}
		
		else {
		System.out.print("The next " + count + " leap years are ");
		for (int i = 0; i < count-1; i++) {
			System.out.print((firstLeap + i*4) + ", ");
		}
		System.out.println("and " + (firstLeap + count*4));
		}
		
	}
	
	/**
	 * Is @number a palindromic number?
	 * 
	 * Print your solution in the following formats: "X is a palindromic number."
	 *                                               "X is not a palindromic number."
	 *                                               
	 * @param number
	 */
	
	public void palindromicNumbers(int number) {
		int reversedNumber = 0;
		int hold = number;
		while (number != 0) {
			reversedNumber = reversedNumber*10 + number % 10;
			number = number / 10;
		}
		if (hold == reversedNumber) {
			System.out.println(hold + " is a palindrome");
		}
		else if (hold != reversedNumber) {
			System.out.println(hold + " is not a palindrome");
		}
	}
	
	/**
	 * What is the @nth Fibonacci number, where @n is a positive integer?
	 * 
	 * Print your solution in the following formats: "The 21st Fibonacci number is X."
	 *                                               "The 22nd Fibonacci number is X."
	 *                                               "The 23rd Fibonacci number is X."
	 *                                               "The 24th Fibonacci number is X."
	 *                                               
	 * @param n
	 */
	
	public void fibonacci(int n) {
		int startSecond = 1;
		int sum = 0;
		int hold = n;
		int last = n % 10;
		int startInitial = 0;
		for (int i = 2; i < hold; i++) {
			sum = startInitial + startSecond;
			startInitial = startSecond;
			startSecond = sum;
		}
		if (n == 11 || n == 12 || n == 13 || n == 14 || n == 15 || n == 16 || n == 17 || n == 18 || n == 19 || n % 100 == 0) {
		System.out.println("The " + n + "th Fibonacci number is " + sum + ".");
		}
		else if (last == 1) {
			System.out.println("The " + n + "st Fibonacci number is " + sum + ".");
		}
		else if (last == 2) {
			System.out.println("The " + n + "nd Fibonacci number is " + sum + ".");
		}
		else if (last == 3) {
			System.out.println("The " + n + "rd Fibonacci number is " + sum + ".");
		}
		else {
			System.out.println("The " + n + "th Fibonacci number is " + sum + ".");
		}
	}
	
	/**
	 * What is the sum of all multiples of @x and @y less than @limit, where @x, @y, and
	 * @limit are positive integers?
	 * 
	 * Print your solution in the following format: "The sum is X."
	 * 
	 * @param limit
	 */
	
	public void multiples(int x, int y, int limit) {
		int sum = 0;
		for (int i = 0; i <= limit; i++) {
			if (i % x == 0 || i % y == 0) {
				sum += i;
			}
		}
		System.out.println("The sum is " + sum + ".");
		
		
	}
}
