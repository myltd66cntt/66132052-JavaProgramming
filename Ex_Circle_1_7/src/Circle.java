public class Circle {

    private int day;
    private int month;
    private int year;

    public Circle(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public static void main(String[] args) {

        Circle d1 = new Circle(11, 3, 2026);
        System.out.println(d1);

        d1.setDay(20);
        d1.setMonth(5);
        d1.setYear(2027);

        System.out.println("Ngay: " + d1.getDay());
        System.out.println("Thang: " + d1.getMonth());
        System.out.println("Nam: " + d1.getYear());

        d1.setDate(1, 1, 2030);
        System.out.println("Ngay moi: " + d1);
    }
}