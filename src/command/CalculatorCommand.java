package command;

public class CalculatorCommand extends Command {
	private char _ch;
	private int _operand;
	Calculator _cal;
	
	public CalculatorCommand(char ch,int operand,Calculator cal) {
		_ch = ch;
		_operand = operand;
		_cal = cal;
	}
	
	@Override
	void execute() {
		_cal.operation(_ch, _operand);
	}

	@Override
	void unexcute() {
		// TODO Auto-generated method stub
		
	}

	
}
