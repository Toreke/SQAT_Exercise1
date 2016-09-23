import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		
		BowlingGame Bgame = new BowlingGame(2, 6);
		assert("8", BowlingGame.score());
	}

}
