public class TestCircle {

    public static void main(String[] args) {

        Circle r1 = new Circle(2, 3);
        System.out.println(r1);

        Circle r2 = new Circle();
        System.out.println(r2);

        r1.setLength(5);
        r1.setWidth(4);

        System.out.println("Length: " + r1.getLength());
        System.out.println("Width: " + r1.getWidth());

        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
    }

}