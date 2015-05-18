package com.pillar.kata;

import java.util.Hashtable;

public class ChangeBackNumber {

	public static String convertFromRoman(String myRoman) {
		
		Integer myTotal = 0;		
		Hashtable<String, Integer> txtValues = new Hashtable<String, Integer>();
		txtValues.put("I", 1);
		txtValues.put("V", 5);
		txtValues.put("X", 10);
		txtValues.put("L", 50);
		txtValues.put("C", 100);
		txtValues.put("D", 500);
		txtValues.put("M", 1000);

		char[] stringToCharArray = myRoman.toCharArray();
		Integer myLastValue;
		Integer myCurrentValue; 
		String myLastChar = "";
		String myCurrentChar = "";
				
		for (int i = 0; i < myRoman.length() ; i++) {

			
			myCurrentChar = stringToCharArray[i] + "";

			if ( i == 0 ){
				myLastChar = myCurrentChar;
			}

		    myLastValue = txtValues.get(myLastChar);
			
		    myCurrentValue = txtValues.get(myCurrentChar);
			
		    if (myLastValue < myCurrentValue) {
		    	myTotal = myTotal + (myCurrentValue - myLastValue - myLastValue);
		    }
		    else
		    {
		    	myTotal += myCurrentValue;
		    }
			myLastChar = myCurrentChar;
			
		}		
		
		return myTotal.toString();
	}

}
