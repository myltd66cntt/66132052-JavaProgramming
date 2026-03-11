public class Ex_1_2a {
    private double radius;

    public Ex_1_2a() {
        radius = 1.0;
    }

    public Ex_1_2a(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        String s = "Circle [radius = " + radius + " ]";
        return s;
    }

    public static void main(String[] args) {
        Ex_1_2a c1 = new Ex_1_2a();
        System.out.println(c1.toString());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());
    }
}