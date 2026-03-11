public class Circle {
    private float length;
    private float width;

    public Circle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Circle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float l) {
        length = l;
    }

    public void setWidth(float w) {
        width = w;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

    public static void main(String[] args) {
        Circle r1 = new Circle(2,3);
        System.out.println(r1);

        r1.setLength(5);
        r1.setWidth(4);

        System.out.println("Length: " + r1.getLength());
        System.out.println("Width: " + r1.getWidth());

        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
    }
}