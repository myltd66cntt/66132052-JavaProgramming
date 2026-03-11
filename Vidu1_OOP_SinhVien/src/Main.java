

public class Main {

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien();
		sv1.ten = "Lê Thị Diễm My";
		sv1.tuoi = 20;
		sv1.mssv = "66132052";
		
		SinhVien sv2 = new SinhVien();
		sv2.ten = "Nguyễn Thị Tươi Tắn Lắm";
		sv2.tuoi = 10;
		sv2.mssv = "66778899";
		
		sv1.hocBai("Lap trinh Java");
		sv2.hocBai("Toan tieu hoc");

	}

}
