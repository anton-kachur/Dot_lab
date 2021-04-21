package lab4.patternChainOfResponsibility;

import lab4.Point.Point;

public interface Chain {
    void setNextChain(Chain nextChain);
    void method(Point number);
}
