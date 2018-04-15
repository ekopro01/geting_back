
public class Player {
	
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
	
}
