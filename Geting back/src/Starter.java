import java.util.ArrayList;

public class Starter {

	public static void main(String[] args) {

		ArrayList<String> players = new ArrayList<String>();
		Deck deck = new Deck();
				
		
		for (Color color : Color.values())
		{
			for (int i=1; i<14; i++)
			{
				deck.addCard(new Card(color, i));
			}
		}
		
		System.out.println(deck.getNumberOfCardsInDeck());
		
		players.add("Igrac 1");
		players.add("Igrac 2");
		players.add("Igrac 3");
		
		Game game = new Game();
		game.addDeck(deck);
		
		game.startGame(players);
		
		

	}

}
