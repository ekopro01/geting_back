import java.io.BufferedReader;
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
		play();
	}
	
	private void dealCardsToPlayers(){
		
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
	
	private void play()
	{
		ArrayList<Integer> order = new ArrayList<Integer>();
		
		if (roundCounter != 0)
		{
			
		}
		else
		{
			firstRound();
		}
	}
	
	private int selectRandomPlayer()
	{
		return ThreadLocalRandom.current().nextInt(0, players.size() + 1);
	}
	
	private void firstRound()
	{
		int firstPlayer = selectRandomPlayer();
		
		if(firstPlayer != 0)
		{
			
		}
		else
		{
			for(Player player : players)
			{
				board.addCard(getCardFromPlayer(player));
			}
		}
		
	}
	
	private Card getCardFromPlayer(Player player)
	{
		System.out.println(player.name + " has following cards ih hand:");
		System.out.println(player.getAllCardsInHand());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Chose card: ");
		String s  = br.readLine();
		
		
		
		return
	}
	
	
	
	
	
	
}
