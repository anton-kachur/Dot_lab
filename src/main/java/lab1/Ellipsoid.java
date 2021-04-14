package lab1;

@ClassAnnotation(name = "Ellipsoid class")
public
class Ellipsoid extends Point {
    private double centerX;
    private double centerY;
    private double a;
    private double b;

    public Ellipsoid(double[] args){
        super(args[0], args[1]);
        centerX = args[2];
        centerY = args[3];
        a = args[4]/2;
        b = args[5]/2;
    }

    @Override
    @Annotation(name="Get parameters of ellipsoid")
    public String toString() {
        return "Center coords = (" + centerX + ", " + centerY + ")\n" +
                "Semi-major axes lengths: a=" + a + ", b=" + b;
    }

    @Override
    @Annotation(name="Get center x coordinate")
    public double getX() {
        return centerX;
    }

    @Override
    @Annotation(name="Get center y coordinate")
    public double getY() { return centerY; }

    @Annotation(name="Get perimeter of ellipsoid")
    public double getPerim(){
        return 4*((Math.PI*a*b - Math.pow((a - b), 2))/(a + b));
    }

    public void move(double x_coord, double y_coord){
        centerX += x_coord;
        centerY += y_coord;
    }

}
