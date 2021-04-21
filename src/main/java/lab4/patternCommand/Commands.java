package lab4.patternCommand;

import java.util.ArrayList;
import java.util.List;

public class Commands implements Command {
    private List<Command> commands = new ArrayList();

    public Commands(List commands){
        this.commands = commands;
    }

    public void execute(){
        for(Command command : commands){
            command.execute();
        }
    }
}