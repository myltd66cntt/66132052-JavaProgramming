package thigk2.LeThiDiemMy;

/*
 * TÓM TẮT CÁCH GIẢI:
 * 1. Khai báo 4 thuộc tính private: maSP, tenSP, loaiSP và giaBan (thuộc tính tự thêm).
 * 2. Constructor: Hàm khởi tạo để gán giá trị cho cả 4 thuộc tính khi tạo đối tượng.
 * 3. Getter/Setter: Các phương thức để truy xuất và cập nhật giá trị (Encapsulation).
 * 4. toString(): Ghi đè phương thức để trả về chuỗi thông tin định dạng sẵn của sản phẩm.
 */
public class SanPham {

	private String maSP;
	private String tenSP;
	private String loaiSP;
	private double giaBan; //thuộc tính thứ 4 em tự thêm

	public SanPham(String maSP, String tenSP, String loaiSP, double giaBan) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.giaBan = giaBan;
	}

	public String getMaSP() { return maSP; }
	public void setMaSP(String maSP) { this.maSP = maSP; }

	public String getTenSP() { return tenSP; }
	public void setTenSP(String tenSP) { this.tenSP = tenSP; }

	public String getLoaiSP() { return loaiSP; }
	public void setLoaiSP(String loaiSP) { this.loaiSP = loaiSP; }

	public double getGiaBan() { return giaBan; }
	public void setGiaBan(double giaBan) { this.giaBan = giaBan; }

	@Override
	public String toString() {
		return "Mã sản phẩm: " + maSP + ", tên sản phẩm: " + tenSP + 
			   ", loại sản phẩm: " + loaiSP + ", giá: " + giaBan;
	}

	public static void main(String[] args) {
		
		SanPham sp = new SanPham("SP001", "Laptop Dell", "Dien tu", 15000000);
		
		System.out.println("===== THÔNG TIN SẢN PHẨM =====");
		System.out.println(sp); 
	}
}