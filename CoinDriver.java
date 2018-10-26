import java.util.Scanner;
public class CoinDriver{
	public static void main(String args[]){
		Coin tossCoin = new Coin();
		Scanner scan = new Scanner(System.in);
		
		boolean done = false;
		while(!done){
			tossCoin.flip();
			if(tossCoin.isHeads()){
				System.out.println(tossCoin);
			}
			else{
				System.out.println(tossCoin);
			}
			System.out.println("Continue? Y/N");
			String continueOrNot = scan.next();
			if (continueOrNot == "N") {
				done = false;
			}

		}


	}
}