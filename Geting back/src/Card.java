import java.util.Comparator;

public class Card implements Comparator<Card>{

	Color color;
	int number;
	
	public Card (Color color, int number){
		this.color = color;
		this.number = number;
	}
	
	public Color getColor(){
		return color;
	}
	
	public int getNumber(){
		return number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (color != other.color)
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return color + " " + number;
	}

	@Override
	public int compare(Card a, Card b) 
	{
		return a.number - b.number;
	}
	
	
		
}
