package lab4.Command;

import java.util.ArrayList;
import java.util.List;

public class Controller{

    private List<Command> buttons;

    public Controller(){
        buttons = new ArrayList();
    }

    public void setCommand(int numButton, Command command){
        buttons.add(numButton, command);
    }

    public void press(int numButton){
        buttons.get(numButton).execute();
    }
}