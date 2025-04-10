package Exercise_3;

public class Circle implements Forma {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double CalculateArea() {
        return (Math.PI*(Math.pow(radius, 2)));
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
