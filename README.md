# NuPack
Submission by: Kiranpreet Uppal

NuPack's MarkupCalculator is designed to calculate markups based on product categories, number of people required to perform job and initial base price. 

Language: Java
Version: 1.8
Classes Included: 1. MarkupCalculator.java - Computational Class
                  2. MarkupCalculatorTest.java - Test Class
                  3. RunTestsFromCommandLine.java - Test Runner Class
Design: 
1. Program has been optimized to minimize memory use and maximize reusablity (by using minimum number of variables possible, replacing     string comparisons with Enum comparisons for faster computation)
2. All fixed numeric values have been declared as Final at the top of computational class so that it is easier to update numbers without going through entire code.
3. Categories have been declared as ENUMs so that products can be easily added or removed 

Dependencies:  Testing Framework: JUnit4

Steps to run tests from Command Line: 

1.  C:\WORKSPACE_PATH>javac -cp .;ABSOLUTE_PATH_TO_JUNIT_JAR; MarkupCalculator.java MarkupCalculatorTest.java RunTestsFromCommandLine.java
2.  C:\WORKSPACE_PATH>java -cp .;ABSOLUTE_PATH_TO_JUNIT_JAR; RunTestsFromCommandLine

