package testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import exercise1.conditioncheck;

public class testcondition {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		conditioncheck test1 = new conditioncheck();
		String output=test1.display(24);
		assertEquals("Tom", output);
	}
	
	@Test
	public void test2() {
		conditioncheck test1 = new conditioncheck();
		String output=test1.display(23);
		assertEquals("Jerry", output);
	}

}
