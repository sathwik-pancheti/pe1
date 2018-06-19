package testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import exercise1.Type;

public class Testtype {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Type test1 = new Type();
		String output = test1.display('A');
		assertEquals("Capital letter", output);
	}
	
	@Test
	public void test2() {
		Type test1 = new Type();
		String output = test1.display('a');
		assertEquals("small letter", output);
	}
	
	@Test
	public void test3() {
		Type test1 = new Type();
		String output = test1.display('8');
		assertEquals("digit", output);
	}

	@Test
	public void test4() {
		Type test1 = new Type();
		String output = test1.display('_');
		assertEquals("specialsymbol", output);
	}
}
