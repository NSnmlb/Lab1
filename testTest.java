package สตั้าป;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testQueryBridgeWords() {
		test t1 = new test();
		t1.init();
		String result = t1.queryBridgeWords("Where","your");
		assertEquals("No bridge words from Where to your!",result);
	}

}