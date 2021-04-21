package lab4.patternChainOfResponsibility;

import lab4.Point.Point;

public class PointThreeDivision implements Chain {
    private Chain chain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void method(Point point) {
        double r = point.getX();
        double i = point.getY();
        if (r >= 3 && i >= 3) {
            double num1 = r / 3;
            double num2 = i / 3;
            double res1 = r % 3;
            double res2 = i % 3;
            System.out.println("X " + r + " is divisible by 3 " + (int)num1 + " times\n" +
                    "Y " + i + " is divisible by 3 " + (int)num2 + " times\n");
            if (res1 != 0 && res2 != 0)
                this.chain.method(new Point(res1, res2));
        } else {
            this.chain.method(point);
        }
    }
}
