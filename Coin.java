import java.util.Random;
public class Coin{
	private int result;
	public Coin(){
		result = 1;
	}
	public boolean isHeads(){
		
		if(result == 1){
			return true;
		}
		else{
			return false;
		}
	}
	public void flip(){
		 //result;
		Random rand = new Random();
		result = rand.nextInt(2) + 1;
	}
	public String toString(){
		String result1;
		result1 = "Player " + result + " goes first.";
		return result1;
	}
}