package nupack;

public class MarkupCalculator {
	
	private double _markup;
	private double _basePrice;
	private String _category;
	private int _numOfPeople;
	
	public MarkupCalculator(double basePrice, String category, int numOfPeople)
	{
		this._basePrice = basePrice;
		this._category = category;
		this._numOfPeople = numOfPeople;
	}
	
	public double calculate(){
		double totalPrice;
		
		//5% flat markup is added
		totalPrice = (this._basePrice * 0.05);
		
		//add labor markup
		totalPrice += (totalPrice * ((this._numOfPeople * 1.2)/100));
		
		//markup for categories
		if(this._category.equalsIgnoreCase("drugs")){
			totalPrice += totalPrice * 0.075;
		}
		else if(this._category.equalsIgnoreCase("food")){
			totalPrice += totalPrice * 0.13;
		}
		else if(this._category.equalsIgnoreCase("electronics")){
			totalPrice += totalPrice * 0.02;
		}
		
		return totalPrice;
	}
}
