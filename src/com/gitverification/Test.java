package com.gitverification;

public class Test {

	public static void main(String[] args) {
		
		String hungry = "Yes";
		
		if (hungry == "Yes"  || hungry == "Y" || hungry == "y")
			System.out.println("eat some food");
		
		else {
			System.out.println("Go for work");
		}
	}
}
