package nupack;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Kiranpreet Uppal
 *
 */

public class RunTestsFromCommandLine {
   public static void main(String[] args) {
	   
      Result result = JUnitCore.runClasses(MarkupCalculatorTest.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.getTestHeader());
      }
      
      System.out.println("Total test count: "+result.getRunCount());
      System.out.println("Failed test count: "+result.getFailureCount());
   }
}
