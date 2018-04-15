import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck 
{
	
	private ArrayList<Card> deck = new ArrayList<Card>();
	int maxNumberOfCardsInDeck = 52;
	
	public Deck()
	{
	}
	
	public Deck(int maxNumberOfCards, List<Card> setOfCards)
	{
		this.maxNumberOfCardsInDeck = maxNumberOfCards;
		if (setOfCards.size() > maxNumberOfCardsInDeck)
		{
			System.out.println("Number of cards in set is too big");
		} 
		else 
		{
			for (Card cardToAdd : setOfCards)
			{
				deck.add(cardToAdd);
			}
		}
	}
	
	
	
	public void addCard(Card card)
	{
		if (deck.size() >= maxNumberOfCardsInDeck)
		{
			System.out.println("Max number of cards in deck");
		} 
		else 
		{
			deck.add(card);
		}
	}
	
	public Card drawCard()
	{
		if (deck.size() == 0)
		{
			System.out.println("Deck is empty");
			return null;
		} 
		else 
		{
			return deck.get(0);
		}
	}
	
	public void discardTopCard()
	{
		if (deck.size() == 0)
		{
			System.out.println("Deck is empty");
		} 
		else 
		{
			deck.remove(0);
		}
	}
	
	public void discardTopCards(int numberOfCardsToDiscard)
	{
		int cardsToRemove = numberOfCardsToDiscard;
		if (deck.size() == 0)
		{
			System.out.println("Deck is empty");
		}
		else if (cardsToRemove > deck.size())
		{
			System.out.println("Can not discart " + cardsToRemove + " cards. Not enough cards in deck.");
		}
		else 
		{
			while(cardsToRemove != 0)
			{
				deck.remove(0);
				cardsToRemove--;
			}
		}
	}
	
	public void shuffle()
	{
		Collections.shuffle(deck);
	}
	
	public void shuffleCardInDeck(Card card)
	{
		if (deck.size() >= maxNumberOfCardsInDeck)
		{
			System.out.println("Max number of cards in deck");
		} 
		else 
		{
			deck.add(card);
			shuffle();
		}
	}
	
	public void shuffleCardsInDeck(List<Card> listOfCards)
	{
		if ((deck.size()+ listOfCards.size()) > maxNumberOfCardsInDeck)
		{
			System.out.println("Number of cards in set is too big");
		} 
		else 
		{
			for (Card cardToAdd : listOfCards)
			{
				deck.add(cardToAdd);
			}
			shuffle();
		}
	}
	
	public Card getLastCardInDeck()
	{
		return deck.get(deck.size()-1);
	}
	
	public int getNumberOfCardsInDeck()
	{
		return deck.size();
	}
	
	public List<Card> getAllCardsInDeck(){
		return deck;
	}

}
