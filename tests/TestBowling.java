import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		
		Frame frame = new Frame(2, 6);
		
		assertArrayEquals("8", frame.score());
	}

}
