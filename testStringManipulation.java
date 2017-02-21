import static org.junit.Assert.*;

import org.junit.Test;

import appleQA.StringManipulation;

public class testStringManipulation {
	
	
	@Test
	public void testNullStringUsingIteration() {
		String givenString = null;
		String expectedResult = null;
		String actualResult = StringManipulation.removeChar(givenString, ' ');
		System.out.println("testNullStringUsingIteration: "+actualResult);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testEmptyStringUsingIteration() {
		String givenString = "";
		String expectedResult = "";
		String actualResult = StringManipulation.removeChar(givenString, ' ');
		System.out.println("testEmptyStringUsingIteration: "+actualResult);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testRemoveContinuousSequenceOfCharUsingIteration() {
		String givenString = "ooo";
		String expectedResult = "";
		String actualResult = StringManipulation.removeChar(givenString, 'o');
		System.out.println("testRemoveContinuousSequenceOfCharUsingIteration: "+actualResult);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testRemoveSequenceOfCharUsingIteration() {
		String givenString = "testing the app";
		String expectedResult = "esing he app";
		String actualResult = StringManipulation.removeChar(givenString, 't');
		System.out.println("testRemoveSequenceOfCharUsingIteration: "+actualResult);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testRemoveGivenCharUsingIteration() {
		String givenString = "Sahil";
		String expectedResult = "Shil";
		String actualResult = StringManipulation.removeChar(givenString, 'a');
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testRemoveSpecialCharUsingIteration() {
		String givenString = "S@hil";
		String expectedResult = "Shil";
		String actualResult = StringManipulation.removeChar(givenString, '@');
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testCaseSensitiveIteration() {
		String givenString = "Shital ";
		String expectedResult = "hital ";
		String actualResult = StringManipulation.removeChar(givenString, 'S');
		System.out.println("testCaseSensitiveIteration: "+actualResult);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testNullString() {
		String givenString = null;
		String expectedResult = null;
		String actualResult = StringManipulation.removeCharByIteration(givenString, ' ');
		System.out.println("testNullString: "+actualResult);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testEmptyString() {
		String givenString = "";
		String expectedResult = "";
		String actualResult = StringManipulation.removeCharByIteration(givenString, ' ');
		System.out.println("testEmptyString: "+actualResult);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testRemoveContinuousSequenceOfChar() {
		String givenString = "ooo";
		String expectedResult = "";
		String actualResult = StringManipulation.removeCharByIteration(givenString, 'o');
		System.out.println("testRemoveContinuousSequenceOfChar: "+actualResult);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testRemoveSequenceOfChar() {
		String givenString = "testing the app";
		String expectedResult = "esing he app";
		String actualResult = StringManipulation.removeCharByIteration(givenString, 't');
		System.out.println("testRemoveSequenceOfChar: "+actualResult);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testRemoveGivenChar() {
		String givenString = "Sahil";
		String expectedResult = "Shil";
		String actualResult = StringManipulation.removeCharByIteration(givenString, 'a');
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testRemoveSpecialChar() {
		String givenString = "S@hil";
		String expectedResult = "Shil";
		String actualResult = StringManipulation.removeCharByIteration(givenString, '@');
		System.out.println("testRemoveSpecialChar: "+actualResult);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testCaseSensitive() {
		String givenString = "HiS@hil ";
		String expectedResult = "Hi@hil ";
		String actualResult = StringManipulation.removeCharByIteration(givenString, 'S');
		System.out.println("testCaseSensitive: "+actualResult);
		assertEquals(expectedResult, actualResult);
	}
	
}
