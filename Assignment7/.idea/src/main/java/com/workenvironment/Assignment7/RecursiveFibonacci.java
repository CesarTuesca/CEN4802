package com.workenvironment.Assignment7;

public class RecursiveFibonacci {
	/**
	 * Create an array to cache fibonacci numbers to improve performance
	 */
	private static long[] fibonacciCache;

	/**
	 * Main method
	 *
	 * @param args command line
	 */
	public static void main(String[] args) {
		// Pass in 10 as an argument which is set as n
		int n = 10;
		// Count sequence terms as iteration
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
		if (fibonacciCache == null) {
			fibonacciCache = new long[n + 1];
		} else if (n < fibonacciCache.length && fibonacciCache[n] != 0) {
			return fibonacciCache[n];
		}

		if (n <= 1) {
			return n;
		}

		long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));

		if (n < fibonacciCache.length) {
			fibonacciCache[n] = nthFibonacciNumber;
		}

		return nthFibonacciNumber;
	}
}