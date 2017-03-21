package nupack;

/**
 * @author Kiranpreet Uppal
 *
 */

public class MarkupCalculator {
	
	//markup percentages
	private final double FLATMARKUP = 5;
	private final double PEOPLEMARKUP = 1.2;
	
	//categories enum consisting markup percentage values
	public enum Categories {
	    DRUGS(7.5), FOOD(13),ELECTRONICS(2),OTHERS(0);
	    private double val;
	    Categories(double numVal) {
	        this.val = numVal;
	    }
	    public double getMarkupValue() {
	        return val;
	    }
	}
	
	//data members
	private double _basePrice;
	private double _categoryMarkup;
	private int _numOfPeople;
	
	public MarkupCalculator(double basePrice, MarkupCalculator.Categories category, int numOfPeople)
	{
		this._basePrice = basePrice;
		this._categoryMarkup = category.getMarkupValue();
		this._numOfPeople = numOfPeople;
	}
	
	public double calculate(){
		double totalPrice = this._basePrice;
		
		//flat markup is added
		totalPrice += (this._basePrice * FLATMARKUP)/100;
		
		//add labor markup, and category markup
		totalPrice += (totalPrice * ((this._numOfPeople * PEOPLEMARKUP)/100)) + ((totalPrice * this._categoryMarkup)/100);
		
		//round upto 2 decimal places
		return (double) Math.round(totalPrice * 100) / 100;
	}

	//getters and setters
	public double get_basePrice() {
		return _basePrice;
	}

	public void set_basePrice(double _basePrice) {
		this._basePrice = _basePrice;
	}

	public int get_numOfPeople() {
		return _numOfPeople;
	}

	public void set_numOfPeople(int _numOfPeople) {
		this._numOfPeople = _numOfPeople;
	}

	public double get_categoryMarkup() {
		return _categoryMarkup;
	}
	
}
