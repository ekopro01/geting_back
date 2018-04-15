import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {

	int maxNumberOfCards = 20;
	ArrayList<Card> cardsInHand = new ArrayList<Card>();

	public Hand() {

	}

	public void addCardInHand(Card card) 
	{
		if (cardsInHand.size() >= maxNumberOfCards) 
		{
			System.out.println("Can not add card, maximum number of cards in hand.");
		} 
		else 
		{
			cardsInHand.add(card);
		}
	}

	public void removeCardFromHand(Card card) 
	{
		if (cardsInHand.contains(card)) 
		{
			cardsInHand.remove(card);
		} 
		else 
		{
			System.out.println("Card not ih hand");
		}
	}

	public void showAllCardsInHand() 
	{
		if (cardsInHand.isEmpty()) {
			System.out.println("No cards in hand.");
		} else {
			for (Card cardToShow : cardsInHand) {
				System.out.println(cardToShow + "\n");
			}
		}
	}

	public List<Card> getAllCardsInHand() 
	{
		return Collections.unmodifiableList(cardsInHand);
	}
	
	public int getNumberOfCardsInHand()
	{
		return cardsInHand.size();
	}

}
