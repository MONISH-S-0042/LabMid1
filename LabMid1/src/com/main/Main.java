package com.main;
public class Main {
	public static void main(String args[]) {
		int mark=Integer.parseInt(args[0]);
		System.out.println("Marks scored-"+mark);
		if(mark>=90) {
			System.out.println("S grade");
		}
		else if(mark>=80) {
			System.out.println("A grade");
		}
		else if(mark>=70) {
			System.out.println("B grade");
		}
		else if(mark>=60) {
			System.out.println("C grade");
		}else if(mark>=50) {
			System.out.println("D grade");
		}
		else {
			System.out.println("F grade");
		}
	}
}
