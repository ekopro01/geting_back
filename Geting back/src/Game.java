import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

	private ArrayList<Player> players = new ArrayList<Player>();
	private Deck deck;
	private int roundCounter = 0;
	private Board board = new Board();
	private ArrayList<Player> playingOrder = new ArrayList<Player>();
	
	
	public Game()
	{
		
	}
	
	public Game(List<Player> players)
	{
		this.players = (ArrayList<Player>) players;
	}
	
	public void addPlayer(Player player)
	{
		players.add(player);
	}
	
	public void setDeck(Deck deck)
	{
		this.deck = deck;
	}
	
	public void startGame()
	{
		dealCardsToPlayers();
		determinePlayingOrder();
		while (!players.get(0).isEmpty())
		{
			playRound();
		}
	}
	
	private void dealCardsToPlayers()
	{
		deck.discardTopCards(deck.getNumberOfCardsInDeck() % players.size());
		deck.shuffle();
		int numberOfCardsForEachPlayer = deck.getNumberOfCardsInDeck() / players.size();
		
		for (Player player : players)
		{
			for (int i = 1; i < numberOfCardsForEachPlayer; i++)
			{
				player.addCard(deck.drawCard());
				deck.discardTopCard();
			}
			System.out.println("Player " + player.name + " has " + player.getNumberOfCardsInHand() + " cards in hand.");
		}
	}
	
	private void playRound()
	{
//		ask players for cards
		getCardsFromPlayers();
//		determine winner
//		give cards to the winner of the round
//		determine playing order for the new round
	}

	private void getCardsFromPlayers() 
	{
		for (Player player : playingOrder)
		{
			board.addCard(player, getCardFromPlayer(player));
		}
	}

	private void determineWinner(){
		
	}
	

	private int selectRandomPlayer()
	{
		return ThreadLocalRandom.current().nextInt(0, players.size());
	}
	
	private void determinePlayingOrder()
	{
			
		int firstPlayer = selectRandomPlayer();
		
		for (int i = firstPlayer; i < players.size(); i++)
		{
			playingOrder.add(players.get(i));
		}
		
		for (int i = 0; i < firstPlayer; i++)
		{
			playingOrder.add(players.get(i));
		}
		System.out.println(playingOrder);
	}
	
	
 	private Card getCardFromPlayer(Player player)
	{
		System.out.println(player.name + " has following cards ih hand:");
		System.out.println(player.getAllCardsInHand());
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Chose card: ");
			String cardNumber  = br.readLine();
			
			return player.playCard(cardNumber);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	
}
