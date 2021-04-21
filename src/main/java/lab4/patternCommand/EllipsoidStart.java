package lab4.patternCommand;

import lab4.Ellipsoid.Ellipsoid;

public class EllipsoidStart implements Command {
    private Ellipsoid e;

    public EllipsoidStart(Ellipsoid e){
        this.e = e;
    }

    public void execute(){
        e.start();
    }
}
