import java.util.ArrayList;
import java.util.Collections;

public class Starter {

	public static void main(String[] args) {

		ArrayList<Player> players = new ArrayList<Player>();
		Deck deck = new Deck();
				
		
		for (Color color : Color.values())
		{
			for (int i=1; i<14; i++)
			{
				deck.addCard(new Card(color, i));
			}
		}
		
		System.out.println(deck.getNumberOfCardsInDeck());
		
		players.add(new Player("Ivan"));
		players.add(new Player("Petar"));
		players.add(new Player("Marko"));
		
		Game game = new Game(players);
		game.setDeck(deck);
		
		game.startGame();
		
		

	}

}
