package com.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.lesson.Calc;

public class TestCalc {

	private static Calc calc;
	
	@BeforeClass
	public static void init(){
		calc = new Calc();
	}
	
	@AfterClass
	public static void destroy(){
		calc = null;
	}
	
	@Test
	public void testAdd(){
		int expected = calc.add(5, 5);
		int real = 10;
		
//		Assert.assertEquals("hahaha", expected, real);
		
		if(expected != real){
//			Assert.fail("haha fail");
		}
	}
	
	@Test
	public void testSubstruct(){
		
//		boolean qb = calc.substruct(2, 2) == 0;
		
		Assert.assertEquals("false", calc.multiply(2, 5), 10);
	}
	
	@Test
	public void testDevide(){
		
		Assert.assertEquals("error", calc.devide(10, 5), 2, 0.001);
	}
	
	
}
