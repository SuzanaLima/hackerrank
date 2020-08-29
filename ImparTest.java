package br.com.hackerrank;

import java.util.Scanner;

public class ImparTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 0) {
			if(n > 1 && n < 6) {
				System.out.println("Not Weird");
			}
			if(n > 20) {
				System.out.println("Not Weird");
			}
			if(n > 5 && n < 21) {
				System.out.println("Weird");
		}else {
			System.out.println("Weird");
		}	
		sc.close();
	}
}
}