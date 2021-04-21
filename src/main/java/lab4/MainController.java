package lab4;

import lab4.Ellipsoid.Ellipsoid;
import lab4.patternChainOfResponsibility.Chain;
import lab4.patternChainOfResponsibility.PointFiveDivision;
import lab4.patternChainOfResponsibility.PointThreeDivision;
import lab4.patternChainOfResponsibility.PointTwoDivision;
import lab4.patternCommand.Commands;
import lab4.patternCommand.Controller;
import lab4.patternCommand.PointStart;
import lab4.patternCommand.EllipsoidStart;
import lab4.Point.Point;
import lab4.patternObserver.Board;
import lab4.patternProxy.NewPointProxy.NewPointProxy;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    Point n1 = new Point(1, 2);
    Ellipsoid n2 = new Ellipsoid(new double[]{1, 2, 3, 4, 5, 6});

    MainController(int choice) {
        switch(choice) {
            case 1: System.out.println("\nCommand pattern"); startCommand(); break;
            case 2: System.out.println("\nDecorator pattern"); startDecorator(); break;
            case 3: System.out.println("\nProxy pattern"); startProxy(); break;
            case 4: System.out.println("\nObserver pattern"); startObserver(); break;
            case 5: System.out.println("\nChainOfResponsibility pattern"); startChainOfResponsibility(); break;
            default: System.out.println("Error! No such pattern!\n");
        }
    }

    public void startCommand() {
        // Создание контроллера, отвечающего за выбор команд
        Controller controller = new Controller();

        // "Приведение в боевую готовность" двух комплексных чисел
        PointStart startComplex = new PointStart(n1);
        EllipsoidStart startExponential = new EllipsoidStart(n2);

        // Список для хранения последовательности команд
        List commands = new ArrayList();

        // Добавляем команду задания комплексного числа
        commands.add(startComplex);

        // Добавляем команду для задания комплексного числа в экспоненциальной форме
        commands.add(startExponential);

        Commands compCom = new Commands(commands);

        // Назначаем команду задания косплексного числа на кнопку 0 на контроллере
        controller.setCommand(0, startComplex);
        // Назначаем команду задания комплексного числа и комплексного числа в
        // экспоненциальной форме на кнопку 1 на контроллере
        controller.setCommand(1, compCom);
        // Нажимаем кнопку
        controller.buttonPress(1);
    }

    public void startDecorator() {
        lab4.patternDecorator.Ellipsoid.Ellipsoid e = new lab4.patternDecorator.Ellipsoid.Ellipsoid(n1);
        e.start();
    }

    public void startProxy() {
        NewPointProxy n3 = new NewPointProxy();
        n3.start();
    }

    public void startObserver() {
        Board n3 = new Board(n1);
        n1.setX(1.0);
        n1.setX(2.0);
        n1.setX(3.0);
    }

    public void startChainOfResponsibility() {
        Chain c1 = new PointFiveDivision();
        Chain c2 = new PointThreeDivision();
        Chain c3 = new PointTwoDivision();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);

        c1.method(new Point(17, 17));
    }
}
