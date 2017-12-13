public class CommandWords {
    private static final String[] validCommands = {
        "go", "quit", "help"
    };

    public CommandWords() {
        // nothing to do at the moment...
    }

    public boolean isCommand(String aString) {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        // if we get here, the string was not found in the commands
        return false;
    }

    public void showAll() {
        for(String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
