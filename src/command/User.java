package command;

import java.util.ArrayList;
import java.util.List;

public class User {
	List<Command> commands = new ArrayList<Command>();
	Calculator cal = new Calculator();
	
	public void compute(char ch,int operand) {
		Command com = new CalculatorCommand(ch,operand,cal);
		com.execute();
		
		commands.add(com);
	}
	
	public void addCommand(Command command) {
		commands.add(command);
	}

	public void executeCommands() {
		for(Command command:commands) {
			command.execute();
		}
	}
}


