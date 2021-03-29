package Calculator;

public class Runner {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		MagicCalculator mcalc = new MagicCalculator();
		
		calc.add(1, 2);
		calc.multiply(1, 3);
		System.out.println(calc.add(1, 2));
		System.out.println(mcalc.sin(54));
	}

}
