package nupack;

public class MarkupCalculator {
	
	//markup percentages
	private final double FLATMARKUP = 5;
	private final double PHARMACEUTICALMARKUP = 7.5;
	private final double FOODMARKUP = 13;
	private final double ELECTRONICSMARKUP = 2;
	private final double PEOPLEMARKUP = 1.2;
	
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
		double totalPrice = this._basePrice;
		
		//5% flat markup is added
		totalPrice += (this._basePrice * FLATMARKUP)/100;
		
		//add labor markup
		totalPrice += (totalPrice * ((this._numOfPeople * PEOPLEMARKUP)/100));
		
		//markup for categories
		if(this._category.equalsIgnoreCase("drugs")){
			totalPrice += (totalPrice * PHARMACEUTICALMARKUP)/100;
		}
		else if(this._category.equalsIgnoreCase("food")){
			totalPrice += (totalPrice * FOODMARKUP)/100;
		}
		else if(this._category.equalsIgnoreCase("electronics")){
			totalPrice += (totalPrice * ELECTRONICSMARKUP)/100;
		}
		
		return totalPrice;
	}

	public double get_basePrice() {
		return _basePrice;
	}

	public void set_basePrice(double _basePrice) {
		this._basePrice = _basePrice;
	}

	public String get_category() {
		return _category;
	}

	public void set_category(String _category) {
		this._category = _category;
	}

	public int get_numOfPeople() {
		return _numOfPeople;
	}

	public void set_numOfPeople(int _numOfPeople) {
		this._numOfPeople = _numOfPeople;
	}
	
	
}
