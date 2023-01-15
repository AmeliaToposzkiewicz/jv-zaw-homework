package second;

public class Circle {
    private double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circuit() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
