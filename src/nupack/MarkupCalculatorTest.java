package nupack;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Kiranpreet Uppal
 *
 */

public class MarkupCalculatorTest {

	@Test
	public void MarkupCalculator_5432_00_Drugs_1_ShouldReturn_6199_81() {
		//Arrange
		MarkupCalculator mc = new MarkupCalculator(5432.00,MarkupCalculator.Categories.DRUGS,1);
		double expectedResult = 6199.81;
		
		//Act
		double actualResult = mc.calculate();
		
		//Assert
		if(actualResult != expectedResult){
			fail("Invalid Answer");
		}
	}
	
	@Test
	public void MarkupCalculator_1299_99_Food_3_ShouldReturn_1591_58() {
		//Arrange
		MarkupCalculator mc = new MarkupCalculator(1299.99,MarkupCalculator.Categories.FOOD,3);
		double expectedResult = 1591.58;
		
		//Act
		double actualResult = mc.calculate();
		
		//Assert
		if(actualResult != expectedResult){
			fail("Invalid Answer");
		}
	}
	
	@Test
	public void MarkupCalculator_12456_95_Others_4_ShouldReturn_13707_63() {
		//Arrange
		MarkupCalculator mc = new MarkupCalculator(12456.95,MarkupCalculator.Categories.OTHERS,4);
		double expectedResult = 13707.63;
		
		//Act
		double actualResult = mc.calculate();
		
		//Assert
		if(actualResult != expectedResult){
			fail("Invalid Answer");
		}	
	}

}
