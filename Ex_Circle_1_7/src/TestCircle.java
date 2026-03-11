public class TestCircle {

    public static void main(String[] args) {

        Circle d1 = new Circle(1, 2, 2014);
        System.out.println(d1);

        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2099);

        System.out.println(d1);

        System.out.println("Thang: " + d1.getMonth());
        System.out.println("Ngay: " + d1.getDay());
        System.out.println("Nam: " + d1.getYear());

        d1.setDate(3, 4, 2016);
        System.out.println(d1);
    }
}