package myltd.quanlynhanvien;

public class Run {

	public static void main(String[] args) {
		// Test lớp nhân viên
		NhanVien nv1 = new NhanVien("001", "Lê Thị Diễm My", 2300000);
//		nv1.hienThiThongTin();
		System.out.print(nv1.toString());
	
	NhanVienVanPhong nvVanPhong1 = new NhanVienVanPhong("002", "Trần Thị Tươi Tắn Lắm", 2300000, 3, 200000);
//	System.out.print(nvVanPhong1.toString());
	nvVanPhong1.hienThiThongTin();
  }

}