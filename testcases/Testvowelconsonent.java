package testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import exercise1.vowelconsonant;

public class Testvowelconsonent {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		vowelconsonant test1 = new vowelconsonant();
		String output = test1.display("sdffa");
		assertEquals("Consonant Consonant Consonant Consonant Vowel ",output);
	}
	
	@Test
	public void test2() {
		vowelconsonant test1 = new vowelconsonant();
		String output = test1.display("asdf2");
		assertEquals("Vowel Consonant Consonant Consonant Input is not a letter.",output);
	}


}
