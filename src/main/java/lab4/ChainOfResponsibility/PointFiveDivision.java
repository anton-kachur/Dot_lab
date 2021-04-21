package lab4.ChainOfResponsibility;

import lab4.Point.Point;

public class PointFiveDivision implements Chain {
    private Chain chain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void method(Point point) {
        double r = point.getX();
        double i = point.getY();
        if (r >= 5 && i >= 5) {
            double num1 = r / 5;
            double num2 = i / 5;
            double res1 = r % 5;
            double res2 = i % 5;
            System.out.println("X " + r + " is divisible by 5 " + (int)num1 + " times\n" +
                    "Y " + i + " is divisible by 5 " + (int)num2 + " times\n");
            if (res1 != 0 && res2 != 0)
                this.chain.method(new Point(res1, res2));
        } else {
            this.chain.method(point);
        }
    }
}

