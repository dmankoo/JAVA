package com.fdmgroup1.firstproject;

public class StringPoolExample {

	public static void main(String[] args) {

		String str = "Adrian";
		String str1 = "Adrian";

		String str2 = new String("A");
		String str3 = new String("A");

		boolean strCheck = str.equals(str1);
		System.out.println(strCheck);

		if (str2 == str3) {
			System.out.println("== String literals gives true");

		}

		if (str == str1) {
			System.out.println("== String literals gives true");

		}

	}

}
