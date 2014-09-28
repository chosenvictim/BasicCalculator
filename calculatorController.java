import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatorController {
	private calculatorView theView;
	private calculatorModel theModel;

	public calculatorController(calculatorView theView, calculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;

		this.theView.addCalculationListener(new calculateListener());
	}

	class calculateListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			int firstNumber, secondNumber = 0;
			try {
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				theModel.addNumbers(firstNumber, secondNumber);
				theView.setCalcSolution(theModel.getCalculationValue());
			} catch (NumberFormatException e) {
				theView.displayErrorMessage("Enter 2 Integers !!");
			}
		}
	}
}