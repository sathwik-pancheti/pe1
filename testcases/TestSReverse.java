package testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import exercise1.StrReverse;

public class TestSReverse {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		StrReverse test1 = new StrReverse();
		String reverse = test1.display("asdf321");
		assertEquals("123fdsa", reverse);
		
	}
	
	@Test
	public void test2() {
		StrReverse test1 = new StrReverse();
		String reverse = test1.display("1234567");
		assertEquals("7654321", reverse);
		
	}

}
