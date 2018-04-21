import java.util.Collections;
import java.util.List;

public class Player {
	
	@Override
	public String toString() {
		return "Player: "+ name;
	}

	Hand hand;
	String name;
	
	public Player(String name)
	{
		this.name = name;
		hand = new Hand();
	}
	
	public String getName()
	{
		return this.name;
	}

	public void addCard(Card card)
	{
		hand.addCardInHand(card);
	}
	
	public List<Card> getAllCardsInHand()
	{
		return Collections.unmodifiableList(hand.getAllCardsInHand());
	}
	
	public int getNumberOfCardsInHand()
	{
		return hand.getNumberOfCardsInHand();
	}
	
	public boolean isEmpty()
	{
		if(hand.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Card playCard(String card)
	{
		int cardToReturn = Integer.parseInt(card);
		Card returnCard = hand.getCard(cardToReturn);
		hand.removeCardFromHand(returnCard);
		return returnCard;
		
	}
	
	
}
