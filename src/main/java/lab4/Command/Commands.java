package lab4.Command;

import java.util.List;

public class Commands implements Command {
    private List<Command> commands;

    public Commands(List commands){
        this.commands = commands;
    }

    public void execute(){
        for(Command command: commands){
            command.execute();
        }
    }
}