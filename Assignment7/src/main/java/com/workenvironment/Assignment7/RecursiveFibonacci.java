package com.workenvironment.Assignment7;

/**
 * Create a java class that contains two methods: A recursive static method that returns the nth
 * term in the Fibonacci sequence. A main method that calls the first method. Pass in 10 as an argument.
 * 
 * @author cesar
 * @version 05/18/2023
 * 
 * Class RecursiveFibonacci uses recursion and caching to calculate and display the nth term in the fibonacci sequence
 */
public class RecursiveFibonacci {
	/**
	 * Create an array to cache fibonacci numbers to improve performance
	 */
	private static long[] fibonacciCache;
    /**
     * Main method
     * @param args command line
     */
	public static void main(String[] args) {
		//Pass in 10 as an argument which is set as n
		int n = 10;
		//Count sequence terms as iteration
		int iteration = 0;
		
		fibonacciCache = new long[n + 1];
		
		for (int i = 0; i <= n; i++, iteration++) {
			
			System.out.println("fibonacci sequence term #" + iteration + ": " + fibonacci(i));
			
		}
		
		
	}
    /**
     * Method calculates nth fibonacci number and stores them in fibonacciCache
     * 
     * @param n is the position of the fibonacci within the array
     * @return the nth fibonacci number
     */
	static long fibonacci(int n) {
		
		if (n <= 1) {
			
			return n;
			
		}
		
		if (fibonacciCache[n] != 0) {
			
			return fibonacciCache[n];
			
		}
		
		long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
		
		fibonacciCache[n] = nthFibonacciNumber;
		
		return nthFibonacciNumber;
	}
	
}
