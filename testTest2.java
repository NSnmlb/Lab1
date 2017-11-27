package สตั้าป;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testTest2 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGenerateNewText() {
		
		test t = new test();
		t.init();
		String result = t.generateNewText("Where you");
		assertEquals("Where are you",result);
	}

}
