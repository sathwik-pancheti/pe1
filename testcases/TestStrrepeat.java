package testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import exercise1.StrRepeat;

public class TestStrrepeat {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		StrRepeat test1 = new StrRepeat();
		String output1 = test1.display("sdf",2);
		assertEquals("sdfdfdf" , output1);
	}
	
	@Test
	public void test2() {
		StrRepeat test1 = new StrRepeat();
		String output1 = test1.display("dytr123",2);
		assertEquals("dytr1232323" , output1);
	}

}
