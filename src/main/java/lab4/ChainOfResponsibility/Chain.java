package lab4.ChainOfResponsibility;

import lab4.Point.Point;

public interface Chain {
    void setNextChain(Chain nextChain);
    void method(Point number);
}
