package Calculator;

class Calculator {
	
	//constructors
	public Calculator() {
		
	}
	
	//methods
	public int subtract(int num1, int num2) {
		return num1-num2;
	}
	
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1*num2;
	}
	
	public int division(int num1, int num2) {
		return num1/num2;
	}
	
	public int square(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}

}
