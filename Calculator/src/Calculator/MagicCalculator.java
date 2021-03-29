package Calculator;
import java.math.*;
public class MagicCalculator extends Calculator{
	
	//constructor
	public MagicCalculator() {
		
	}
	
	//methods
	public double squareRoot( int num1) {
		return Math.sqrt(num1);
	}
	
	public double sin(int num1) {
		return Math.sin(num1);
	}
	
	public double cosine(double num1) {
		return Math.cos(num1);
	}
	
	public double tangent(double num1) {
		return Math.tan(num1);
	}
	
	public double factorial(double num1) {
		double fact = 1;
	    for (int i = 2; i <= num1; i++) {
	        fact = fact * i;
	    }
	    return fact;
	}


}
