package com.numberfun;

import java.awt.Component;

import javax.swing.JOptionPane;

public class ChangeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	
    	String convertedNumber = "Your Roman Numeral is: ";
    	Integer numberToConvert = getNumber();
    	convertedNumber = convertedNumber + convertToRoman(numberToConvert);
		Component frame = null;
		JOptionPane.showMessageDialog(frame, convertedNumber);

	}
	
	public static String convertToRoman(Integer numberToConvert) {
		// TODO Auto-generated method stub
		String returnString = "";
		while (numberToConvert > 0){
			while(numberToConvert >= 1000){
				returnString += "M";
				numberToConvert -= 1000;
			}
			while(numberToConvert >= 900){
				returnString += "CM";
				numberToConvert -= 900;
			}
			while(numberToConvert >= 500){
				returnString += "D";
				numberToConvert -= 500;
			}
			while(numberToConvert >= 400){
				returnString += "CD";
				numberToConvert -= 400;
			}
			while(numberToConvert >= 100){
				returnString += "C";
				numberToConvert -= 100;
			}
			while(numberToConvert >= 90){
				returnString += "XC";
				numberToConvert -= 90;
			}
			while(numberToConvert >= 50){
				returnString += "L";
				numberToConvert -= 50;
			}
			while(numberToConvert >= 40){
				returnString += "XL";
				numberToConvert -= 40;
			}
			while(numberToConvert >= 10){
				returnString += "X";
				numberToConvert -= 10;
			}
			while(numberToConvert >= 9){
				returnString += "IX";
				numberToConvert -= 9;
			}
			while(numberToConvert >= 5){
				returnString += "V";
				numberToConvert -= 5;
			}
			while(numberToConvert >= 4){
				returnString += "IV";
				numberToConvert -= 4;
			}
			while(numberToConvert >= 1){
				returnString += "I";
				numberToConvert -= 1;
			}
		
		}
			
		return returnString;
	}

	private static Integer getNumber() {
		Integer number = 0;
		Boolean firstTime = true;
		String response;
		String message = "Please Input a number: ";
		String notValidMessage = "Not a valid response: ";
		//Loop until number in range
		while (number <1 || number > 3000){		
			if (firstTime){
				response = JOptionPane.showInputDialog(message);
			} else {
				response = JOptionPane.showInputDialog(notValidMessage + message);
			}
			//Loop until we get a valid number
			while (response == null || response.isEmpty() || (!response.matches("\\d+")) ){
				response = JOptionPane.showInputDialog(notValidMessage + message);
			}
			//set number to response.
			number = Integer.parseInt(response);			
		}
		return number;
	}

}
