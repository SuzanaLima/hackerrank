package br.com.hackerrank;

import java.util.Scanner;

public class PrintfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<2;i++){
            String s1 = sc.next();
            int x1 = sc.nextInt();
           //tratamento das casas do inteiro
            String x1String = String.valueOf(x1);
            if(x1String.length() == 2) {
            	x1String = "0" + x1String;
            }else if(x1String.length() == 1) {
            	x1String = "00" + x1String;
            }
            //preencher os espacos
            String espacos = "               ";
            int n = espacos.length() - s1.length();
            String espacosTotal = "";
            for(int j=0; j<n;j++){
            	espacosTotal +=".";
            }
            String formatada = s1 + espacosTotal;
            System.out.printf("%s %s",formatada ,x1String);
        }
        System.out.println();
        System.out.println("================================");
        sc.close();
	}

}

