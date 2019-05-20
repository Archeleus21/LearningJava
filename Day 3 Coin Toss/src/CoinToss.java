import java.util.Random;

//coin toss game
public class CoinToss 
{
	//method/function to toss coin
	public String TossCoin()
	{
		//generates random number, needs import java.util.Random at top.
		Random rand = new Random();
		//after random number is generated no matter how large
		//we check if it is divisible by 2 which returns a 0 or 1
		int coinFace = Math.abs(rand.nextInt()) % 2;
		if(coinFace == 0)
		{
			return "Heads!";
		}
		else
		{
			return "Tails!";
		}		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CoinToss game = new CoinToss();
		
		System.out.println(game.TossCoin());
		System.out.println(game.TossCoin());
		System.out.println(game.TossCoin());
		System.out.println(game.TossCoin());
		System.out.println(game.TossCoin());
		System.out.println(game.TossCoin());
		System.out.println(game.TossCoin());

	}

}
