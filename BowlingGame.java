import java.util.ArrayList;
import java.util.List;

//Finish time: 16:45
//ID: 149

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
		Frame bonusframe = new Frame(firstThrow, secondThrow);
		this.addFrame(bonusframe);
	}
	
	// Returns the game score
	public int score(){
		int i = 1;
		int n = 0;
		int m = 1;
		int total = 0;
		
		while(i <= frames.size()){
			total = this.frames.get(n).getFirstThrow() + this.frames.get(m).getSecondThrow() + total;
		}
			
		return total;
	}
}
