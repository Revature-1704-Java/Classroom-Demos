public class Game {
    private Parser parser;
    private Room currentRoom;

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
        
    public Game() {
        createRooms();
        parser = new Parser();
    }

    private void createRooms() {
        Room outside, lobby, elevator, classroom, office;
      
        // create the rooms
        outside = new Room("outside the main office. It's pretty cold");
        lobby = new Room("in the building lobby. It's still pretty cold");
        elevator = new Room("inside the elevator. It's somehow even colder");
        office = new Room("in Revature's main office. You have mail, but it's cold");
        classroom = new Room("in our classroom. It is dark.\nYou are eaten by a grue.\nThe end");
        
        // initialise room exits
        outside.setExit("lobby", lobby);

        lobby.setExit("elevator", elevator);
        lobby.setExit("outside", outside);

        elevator.setExit("lobby", lobby);
        elevator.setExit("office", office);

        office.setExit("elevator", elevator);
        office.setExit("classroom", classroom);

        currentRoom = outside;  // start game outside
    }

    public void play() {            
        printWelcome();

        boolean finished = false;
        while (!finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("Welcome to RevAventure!");
        System.out.println("A mysterious game.");
        System.out.println("The only winning move is not to play.");
        System.out.println("Type 'help' if you need help.");
        System.out.println(currentRoom.getLongDescription());
    }

    private boolean processCommand (Command command) {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        }
        else if (commandWord.equals("go")) {
            goRoom(command);
        }
        else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }
        // else command not recognised.
        return wantToQuit;
    }

    private void printHelp() {
        System.out.println("You are lost. You ask StackOverflow for help.");
        System.out.println("A voice on high speaks out:");
        System.out.println();
        parser.showCommands();
    }

    private void goRoom(Command command) {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("Can't go there!");
        }
        else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }
    }

    private boolean quit(Command command) {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
}
