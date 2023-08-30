package com.Manaswini.Patterns;
import java.util.Scanner;

public class ReverseLeftHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int k=1;k<=(n-i);k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();		}

	}

}
