import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		
		Frame frame = new Frame(2, 6);
		
		assertEquals(8, frame.score());
	}
	
	@Test
	public void test2() {
		
		Frame frame = new Frame(0, 9);
		
		assertEquals(9, frame.score());
	}

}
