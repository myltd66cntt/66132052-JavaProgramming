package myltd.quanlynhanvien;

public class NhanVienVanPhong extends NhanVien {
    private double soGioLamThem;
    private double luongThemMoiGio;
    
    // 1. Sửa hàm tạo để nhận đủ 5 tham số
    public NhanVienVanPhong(String maNV, String hoTen, double luongCoBan, double soGioLamThem, double luongThemMoiGio) {
        super(maNV, hoTen, luongCoBan); 
        this.soGioLamThem = soGioLamThem;
        this.luongThemMoiGio = luongThemMoiGio;
    }
	
    @Override
    public double tinhLuong() {
        // 2. Gọi phương thức tính lương của lớp cha
        return super.tinhLuong() + (soGioLamThem * luongThemMoiGio);
    }

    @Override
    public void hienThiThongTin() { // Lưu ý tên hàm phải khớp chính xác với lớp cha (phân biệt hoa thường)
        super.hienThiThongTin();
        System.out.println("Số giờ làm thêm: " + soGioLamThem);
        System.out.println("Lương mỗi giờ làm thêm: " + luongThemMoiGio);
        System.out.println("Tổng lương: " + tinhLuong());
    }
}