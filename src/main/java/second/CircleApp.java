package second;

public class CircleApp {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3);
        System.out.println(circle.getRadius());
        double area = circle.area();
        System.out.println(area);
        double circuit = circle.circuit();
        System.out.println(circuit);
    }
}
