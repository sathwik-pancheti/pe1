package testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import exercise1.loop;

public class testloop {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		loop test1 = new loop();
		String output=test1.display(4);
		assertEquals("1 2 2 3 3 3 4 4 4 4 ", output);
	}
	
	@Test 
	public void test2() {
		loop test1 = new loop();
		String output=test1.display(6);
		assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 ", output);
	}
	
	@Test
	public void test3() {
		loop test1 = new loop();
		String output=test1.display(2);
		assertEquals("1 2 2 ", output);
	}

}
