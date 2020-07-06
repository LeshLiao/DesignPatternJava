package command;

public class Calculator {
	private int _currentValue;
	public void operation(char ch,int operand) {
		
		switch(ch)
		{
			case '+':
				_currentValue += operand;
			break;
			case '-':
				_currentValue -= operand;
			break;
			case '*':
				_currentValue *= operand;
			break;
			case '/':
				_currentValue /= operand;
			break;
		}
		
		System.out.println(ch+String.valueOf(operand)+"="+String.valueOf(_currentValue));
	}
}
