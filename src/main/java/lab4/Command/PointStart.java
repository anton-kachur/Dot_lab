package lab4.Command;

import lab4.Point.Point;

public class PointStart implements Command {
    private final Point p;

    public PointStart(Point p){
        this.p = p;
    }

    public void execute(){
        System.out.println(p.toString());
    }
}
