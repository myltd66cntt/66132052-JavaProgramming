public class Circle {
    private String id;
    private String name;
    private int balance = 0;

    public Circle(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Circle(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Circle another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString() {
        return "Circle [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }

    public static void main(String[] args) {

        Circle c1 = new Circle("A101", "Le Thi Diem My", 1000);
        Circle c2 = new Circle("A102", "Vo Hung", 500);

        System.out.println(c1);
        System.out.println(c2);

        c1.credit(200);
        System.out.println("Sau khi nap tien: " + c1);

        c1.debit(100);
        System.out.println("Sau khi rut tien: " + c1);

        c1.transferTo(c2, 300);

        System.out.println("Sau khi chuyen tien:");
        System.out.println(c1);
        System.out.println(c2);
    }
}