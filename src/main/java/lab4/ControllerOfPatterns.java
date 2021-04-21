package lab4;

import lab4.Ellipsoid.Ellipsoid;
import lab4.ChainOfResponsibility.Chain;
import lab4.ChainOfResponsibility.PointFiveDivision;
import lab4.ChainOfResponsibility.PointThreeDivision;
import lab4.ChainOfResponsibility.PointTwoDivision;
import lab4.Command.Commands;
import lab4.Command.Controller;
import lab4.Command.PointStart;
import lab4.Command.EllipsoidStart;
import lab4.Point.Point;
import lab4.ObserverPattern.Board;
import lab4.Proxy.NewPointProxy.NewPointProxy;

import java.util.ArrayList;
import java.util.List;

public class ControllerOfPatterns {
    Point p1 = new Point(1.1, 2.2);
    Ellipsoid e = new Ellipsoid(new double[]{1, 2, 3, 4, 5, 6});

    ControllerOfPatterns(int choice) {
        switch(choice) {
            case 1: System.out.println("\n1) Proxy"); line(); ProxyPattern(); break;
            case 2: System.out.println("\n2) ChainOfResponsibility"); line(); ChainOfResponsibilityPattern(); break;
            case 3: System.out.println("\n3) Observer"); line(); ObserverPattern(); break;
            case 4: System.out.println("\n4) Decorator"); line(); DecoratorPattern(); break;
            case 5: System.out.println("\n5) Command"); line(); CommandPattern(); break;

            default: System.out.println("Invalid input\n");
        }
    }

    public void line() {
        System.out.println("====================");
    }

    public void CommandPattern() {
        Controller controller = new Controller();
        PointStart start_point = new PointStart(p1);
        EllipsoidStart start_ellipsoid = new EllipsoidStart(e);
        List commands = new ArrayList();

        commands.add(start_point);
        commands.add(start_ellipsoid);

        Commands array_commands = new Commands(commands);

        controller.setCommand(0, start_point);
        controller.setCommand(1, array_commands);
        controller.press(1);
    }

    public void DecoratorPattern() {
        lab4.Decorator.Ellipsoid.Ellipsoid e = new lab4.Decorator.Ellipsoid.Ellipsoid(p1);
        e.start();
    }

    public void ProxyPattern() {
        NewPointProxy pp = new NewPointProxy();
        pp.start();
    }

    public void ObserverPattern() {
        Board b = new Board(p1);
        p1.setX(1.0);
        p1.setX(2.0);
        p1.setX(3.0);
    }

    public void ChainOfResponsibilityPattern() {
        Chain c1 = new PointFiveDivision();
        Chain c2 = new PointThreeDivision();
        Chain c3 = new PointTwoDivision();

        c1.setNextChain(c2);
        c2.setNextChain(c3);

        try {
            c1.method(new Point(19, 19));
        }catch (NullPointerException exception){
            System.out.println("");
        }
    }
}
