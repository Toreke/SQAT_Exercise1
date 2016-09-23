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
	
	@Test
	public void test3() {
		
		BowlingGame Bgame = new BowlingGame();
		Frame frame = new Frame(1,5);
		Frame frame = new Frame(3,6);
		Frame frame = new Frame(7,2);
		Frame frame = new Frame(3,6);
		Frame frame = new Frame(4,4);
		Frame frame = new Frame(5,3);
		Frame frame = new Frame(3,3);
		Frame frame = new Frame(4,5);
		Frame frame = new Frame(8,1);
		Frame frame = new Frame(2,6);
		
		assertEquals([2,6], frame.());
	}


}
