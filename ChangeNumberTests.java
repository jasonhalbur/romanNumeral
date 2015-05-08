package com.numberfuntest;

import org.junit.Test;

import com.numberfun.ChangeNumber;
import static org.junit.Assert.*;

public class ChangeNumberTests {

	@Test
	public void ChangeNumberConvertToRoman10(){
		assertEquals("ConvertToRoman failed for 10", "X", ChangeNumber.convertToRoman(10));
	}
	@Test
	public void ChangeNumberConvertToRoman4(){
		assertEquals("ConvertToRoman failed for 4", "IV", ChangeNumber.convertToRoman(4));
	}
	@Test
	public void ChangeNumberConvertToRoman1(){
		assertEquals("ConvertToRoman failed for 1", "I", ChangeNumber.convertToRoman(1));
	}
	@Test
	public void ChangeNumberConvertToRoman171(){
		assertEquals("ConvertToRoman failed for 171", "CLXXI", ChangeNumber.convertToRoman(171));
	}
	@Test
	public void ChangeNumberConvertToRoman1776(){
		assertEquals("ConvertToRoman failed for 1776", "MDCCLXXVI", ChangeNumber.convertToRoman(1776));
	}
	@Test
	public void ChangeNumberConvertToRoman2015(){
		assertEquals("ConvertToRoman failed for 2015", "MMXV", ChangeNumber.convertToRoman(2015));
	}

}
