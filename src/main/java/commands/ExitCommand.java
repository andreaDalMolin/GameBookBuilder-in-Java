package commands;

import consoles.Console;

public class ExitCommand extends Command{
	
	private final Console console;

	public ExitCommand(final Console console) {
		super("exit", "Exits the program");
		this.console = console;
	}

	@Override
	public void execute() {
		console.printLine("Au revoir !");
		console.exit();
	}
}
