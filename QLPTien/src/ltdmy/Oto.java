package ltdmy;

public class OTo extends PhuongTien {
    private int soCho;
    private String nhienLieu;

    public OTo(String hangSanXuat, int namSanXuat, int giaBan, int soCho, String nhienLieu) {
        super(hangSanXuat, namSanXuat, giaBan);
        this.soCho = soCho;
        this.nhienLieu = nhienLieu;
    }

    @Override
    public int layVanTocToiDa() {
        return 180;
    }

    @Override
    public int laySoChoNgoi() {
        return soCho;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Nhiên liệu: " + nhienLieu);
    }
}