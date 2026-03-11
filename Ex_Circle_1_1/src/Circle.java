public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());

        Circle c2 = new Circle(5);
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Area: " + c2.getArea());
    }
}