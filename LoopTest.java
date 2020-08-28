package br.com.hackerrank;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i=1;i<11;i++) {
			int resultado = N * i;
			System.out.println(N + " * " + i + " = " + resultado );
		}
		scanner.close();
	}

}
