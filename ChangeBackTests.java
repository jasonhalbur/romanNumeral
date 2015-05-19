package com.pillar.kataTest;

import static org.junit.Assert.*;
import com.pillar.kata.ChangeBackNumber;
import org.junit.Test;

public class ChangeBackTests {

	@Test
	public void ChangeBackNumberconvertFromRomanI(){
		assertEquals("convertFromRoman failed for I", "1", ChangeBackNumber.convertFromRoman("I"));
	}
	@Test
	public void ChangeBackNumberconvertFromRomanV(){
		assertEquals("convertFromRoman failed for V", "5", ChangeBackNumber.convertFromRoman("V"));
	}
	@Test
	public void ChangeBackNumberconvertFromRomanX(){
		assertEquals("convertFromRoman failed for X", "10", ChangeBackNumber.convertFromRoman("X"));
	}
	@Test
	public void ChangeBackNumberconvertFromRomanII(){
		assertEquals("convertFromRoman failed for II", "2", ChangeBackNumber.convertFromRoman("II"));
	}
	@Test
	public void ChangeBackNumberconvertFromRomanIV(){
		assertEquals("convertFromRoman failed for IV", "4", ChangeBackNumber.convertFromRoman("IV"));
	}
	@Test
	public void ChangeBackNumberconvertFromRomanIX(){
		assertEquals("convertFromRoman failed for IX", "9", ChangeBackNumber.convertFromRoman("IX"));
	}
	@Test
	public void ChangeNumberconvertFromRomanMDCCLXXVI(){
		assertEquals("convertFromRoman failed for MDCCLXXVI", "1776", ChangeBackNumber.convertFromRoman("MDCCLXXVI"));
	}
	@Test
	public void ChangeNumberconvertFromRomanCLXXI(){
		assertEquals("convertFromRoman failed for CLXXI", "171", ChangeBackNumber.convertFromRoman("CLXXI"));
	}
	@Test
	public void ChangeNumberconvertFromRomanMMXV(){
		assertEquals("convertFromRoman failed for MMXV", "2015", ChangeBackNumber.convertFromRoman("MMXV"));
	}

}
