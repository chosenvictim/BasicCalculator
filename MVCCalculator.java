public class MVCCalculator {
	public static void main(String[] args) {
		calculatorView theView = new calculatorView();
		calculatorModel theModel = new calculatorModel();
		calculatorController theController = new calculatorController(theView,
				theModel);

		theView.setVisible(true);
	}
}