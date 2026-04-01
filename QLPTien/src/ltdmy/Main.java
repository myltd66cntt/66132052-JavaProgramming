package ltdmy;

public class Main {
    public static void main(String[] args) {

        PhuongTien pt1 = new PhuongTien();
        pt1.hienThiThongTin();

        System.out.println();

        XeMay xm1 = new XeMay("Honda", 2024, 32000000, 50, "Số");
        xm1.hienThiThongTin();

        System.out.println();

        OTo ot1 = new OTo("Toyota", 2025, 400000000, 4, "xăng");
        ot1.hienThiThongTin();
    }
}