import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

	private ArrayList<Player> players = new ArrayList<Player>();
	private Deck deck = new Deck();
	private int roundNumber = 0;
	
	
	
	public void startGame(ArrayList<String> players)
	{
		createPlayers(players);
		dealCardsAtStart();
//		determinWhoGoesFirst();
//		playRound();
//		determinWinnerOfRound();
//		putCardsFromBoardToGraveyard();
//		determinIfGameIsOver();
		
	} 
	
	private void createPlayers(ArrayList<String> playersToAdd)
	{
		for (String playerName : playersToAdd)
		{
			players.add(new Player(playerName));
			System.out.println("igrac " + playerName + " dodan");
		}
	}
	
	private void dealCardsAtStart()
	{
		int cardsToRemove = deck.getNumberOfCardsInDeck() % getNumberOfPlayers();
		deck.discardTopCards(cardsToRemove);
		
		deck.shuffle();
		
		int cardsToEachPlayer = deck.getNumberOfCardsInDeck() / players.size();
		
		System.out.println(deck.getNumberOfCardsInDeck());
		
		for (Player player : players)
		{
			for (int i=1; i < cardsToEachPlayer; i++)
			{
				player.addCard(deck.drawCard());
				deck.discardTopCard();
			}
		}
		
		System.out.println("svaki igrac ima " + cardsToEachPlayer + " karata u ruci.");
		
	}
	
	private int getNumberOfPlayers()
	{
		return players.size();
	}
	
	private int selectRandomPlayer()
	{
		return ThreadLocalRandom.current().nextInt(0, players.size() +1);
	}
	
	private void playRoud(){
		if (roundNumber != 0)
		{
			
		} else {
			
		}
	}
	
	
	
	
	
	public void addDeck(Deck deck)
	{
		this.deck = deck;
	}
	
}
