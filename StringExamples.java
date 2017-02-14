package com.fdmgroup1.firstproject;

public class StringExamples {

	public static void main(String[] args) {
		
		String str1="Adrian";
		
		String str2=new String("Adrian");
		
		
		int len = str2.length();
		for(int counter=0;counter<len;counter++)
		{
			char theCharacter = str2.charAt(counter);
			System.out.println(theCharacter);
		
		}
		
		int index = str2.indexOf("A");
		
		System.out.println(index);
		
		boolean strEquals = str2.equals("Ade");
		System.out.println(strEquals);
		
		String newString = str2.concat(" O'Brien");
		
		System.out.println(newString);
		
		
		
		
		
		
	}

}
