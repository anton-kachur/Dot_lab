package lab4.patternObserver;

public class Board implements Observer {
    private Notifier notifier;
    private double x;
    private double y;

    public Board(Notifier notifier){
        this.notifier = notifier;
        notifier.addObserver(this);
    }

    @Override
    public void update(double x, double y) {
        this.x = x;
        this.y = y;
        show();
    }

    public void show(){
        System.out.println("Point(" + x + ", " + y + ")");
    }
}
