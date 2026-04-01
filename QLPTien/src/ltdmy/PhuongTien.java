package ltdmy;

public class PhuongTien {
    private String hangSanXuat;
    private int namSanXuat;
    private int giaBan;

    public PhuongTien() {}

    public PhuongTien(String hangSanXuat, int namSanXuat, int giaBan) {
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
    }

    public int layVanTocToiDa() {
        return 0;
    }

    public int laySoChoNgoi() {
        return 0;
    }

    public void hienThiThongTin() {
        System.out.println("Hãng: " + hangSanXuat);
        System.out.println("Năm: " + namSanXuat);
        System.out.println("Giá: " + giaBan);
        System.out.println("Vận tốc tối đa: " + layVanTocToiDa());
        System.out.println("Số chỗ ngồi: " + laySoChoNgoi());
    }
}