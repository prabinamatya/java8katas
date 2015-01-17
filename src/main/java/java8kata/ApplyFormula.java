package java8kata;

public class ApplyFormula implements Formula {

	public void testFormualInterface() {
		Formula formula = new Formula() {

			@Override
			public double calculate(int a) {
				return 4 * a;
			}
		};

		System.out.println("calling anonymous" + formula.calculate(4));
		System.out.println("calling default interface method"
				+ formula.sqrt(25));
	}

	@Override
	public double calculate(int a) {
		return 2 * a;
	}

}
