import java.util.ArrayList;
import java.util.List;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		int i = 1;
		int score;
		int n = 0;
		int m = 1;
		int total = 0;
		
		while(i <= 10){
			total = this.frames[1].getFirstThrow() + this.frames[2}.getSecondThrow();
		}
			
		return score;
	}
}
