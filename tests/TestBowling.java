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
		Bgame.addFrame(frame);
		
		Frame frame2 = new Frame(3,6);
		Bgame.addFrame(frame2);
		
		Frame frame3 = new Frame(7,2);
		Bgame.addFrame(frame3);
		
		Frame frame4 = new Frame(3,6);
		Bgame.addFrame(frame4);
		
		Frame frame5 = new Frame(4,4);
		Bgame.addFrame(frame5);
		
		Frame frame6 = new Frame(5,3);
		Bgame.addFrame(frame6);
		
		Frame frame7 = new Frame(3,3);
		Bgame.addFrame(frame7);
		
		Frame frame8 = new Frame(4,5);
		Bgame.addFrame(frame8);
		
		Frame frame9 = new Frame(8,1);
		Bgame.addFrame(frame9);
		
		Frame frame10 = new Frame(2,6);
		Bgame.addFrame(frame10);
		
		assertEquals(80, Bgame.score());
	}


}
