package dmy;

public class SanPham {
    private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;

    // Constructor rỗng
    public SanPham() {
        this.maSP = "";
        this.tenSP = "";
        this.gia = 0;
        this.soLuong = 0;
    }

    // Constructor đầy đủ
    public SanPham(String maSP, String tenSP, double gia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    // Setter giá
    public void setGia(double gia) {
        this.gia = gia;
    }

    // Tính thành tiền
    public double tinhThanhTien() {
        return gia * soLuong;
    }

    // toString để in ra đẹp
    @Override
    public String toString() {
        return "Ma: " + maSP + ", Ten: " + tenSP + 
               ", Gia: " + gia + ", So luong: " + soLuong;
    }
}