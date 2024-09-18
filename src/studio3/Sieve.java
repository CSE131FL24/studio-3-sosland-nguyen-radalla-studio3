package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Calculate prime numbers until: ");
			int n = in.nextInt();
			
		System.out.println("Prime number until: " + n);
	
		for (int i=2; (i <= n); i++) {
		
			boolean isPrime = true;

				for (int j=2; j*j <= i; j++) {
					if (i/j*j == i) {
						isPrime = false;
						break;
				}

	
	if (isPrime == true)
		
		System.out.println(i + "");
	}
		
	}
	}

}
