/* Shekhar Kumar
 * Model Class
 */
public class calculatorModel {

	private int calculationValue;

	public void addNumbers(int first, int second) {
		calculationValue = first + second;
	}

	public int getCalculationValue() {
		return calculationValue;
	}
}