package testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import exercise1.Intadd;


public class Testadd {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int [] data = {12,11,88,4};
		Intadd test1 = new Intadd();
		int output=test1.display(data);
		assertEquals(115, output);
	}

}
