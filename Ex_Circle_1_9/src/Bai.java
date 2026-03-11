public class Bai {

    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Bai(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    public String toString() {
        return "Bai[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }

    public static void main(String[] args) {

        Bai b1 = new Bai(1, 2, 5, 0.5f, 1.0f);
        System.out.println("Ban dau: " + b1);

        b1.move();
        System.out.println("Sau khi move: " + b1);

        b1.reflectHorizontal();
        System.out.println("Sau khi doi huong ngang: " + b1);

        b1.reflectVertical();
        System.out.println("Sau khi doi huong doc: " + b1);
    }
}