package com.qa.main;

public class Methods {
	
	// flowchart 1
	public void flowchart1() {
		for (int a = 100; a <= 200; a++) {
			System.out.println(a);
		}
	}
	
	// flowchart 2
	public void flowchart2() {
		for (int a = 100; a <= 200; a++) {
			if (a % 2 == 0) {
				System.out.println("-");
				} else { 
					System.out.println("*");
			}
		}
	}
	
	// question 3
	public void printTenTimes() {
		
		for (int a = 1; a <= 10; a++) {
			
			for (int b = 1; b <= 10; b++) {
				
				System.out.println(b);
			}
		}
	}
	
	// question 5
	public void printNTimes(int num) {
		
		for (int a = 1; a < num; a++) {
			
			for (int b = 1; b < 11; b++) {
				
				System.out.println(b);
			}
				
		}
	}

}
