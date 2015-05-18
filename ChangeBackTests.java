package com.numberfuntest;

import static org.junit.Assert.*;

import com.numberfuntest.ChangeBackNumber;

import org.junit.Test;

public class ChangeBackTests {

	@Test
	public void ChangeBackNumberConvertToArabicI(){
		assertEquals("ConvertFromRoman failed for I", "1", ChangeBackNumber.convertFromRoman("I"));
	}
	@Test
	public void ChangeBackNumberConvertToArabicV(){
		assertEquals("ConvertFromRoman failed for V", "5", ChangeBackNumber.convertFromRoman("V"));
	}
	@Test
	public void ChangeBackNumberConvertToArabicX(){
		assertEquals("ConvertFromRoman failed for X", "10", ChangeBackNumber.convertFromRoman("X"));
	}
	@Test
	public void ChangeBackNumberConvertToArabicII(){
		assertEquals("ConvertFromRoman failed for II", "2", ChangeBackNumber.convertFromRoman("II"));
	}
	@Test
	public void ChangeBackNumberConvertToArabicIV(){
		assertEquals("ConvertFromRoman failed for IV", "4", ChangeBackNumber.convertFromRoman("IV"));
	}
	@Test
	public void ChangeBackNumberConvertToArabicIX(){
		assertEquals("ConvertFromRoman failed for IX", "9", ChangeBackNumber.convertFromRoman("IX"));
	}
	@Test
	public void ChangeNumberConvertToRomanMDCCLXXVI(){
		assertEquals("ConvertToRoman failed for MDCCLXXVI", "1776", ChangeBackNumber.convertFromRoman("MDCCLXXVI"));
	}
	@Test
	public void ChangeNumberConvertToRomanCLXXI(){
		assertEquals("ConvertToRoman failed for CLXXI", "171", ChangeBackNumber.convertFromRoman("CLXXI"));
	}
	@Test
	public void ChangeNumberConvertToRomanMMXV(){
		assertEquals("ConvertToRoman failed for MMXV", "2015", ChangeBackNumber.convertFromRoman("MMXV"));
	}

}
