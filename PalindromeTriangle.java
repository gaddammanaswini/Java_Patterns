package com.Manaswini.Patterns;
import java.util.Scanner;

public class PalindromeTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=(n-i);k++) {
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
