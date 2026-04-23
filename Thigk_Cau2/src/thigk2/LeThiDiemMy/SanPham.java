package thigk2.LeThiDiemMy;

/*
 * TÓM TẮT CÁCH GIẢI:
 * 1. Khai báo 4 thuộc tính private: maSP, tenSP, loaiSP và giaSP.
 * 2. Constructor: Hàm khởi tạo để gán giá trị cho 4 thuộc tính trên.
 * 3. Getter/Setter: Các phương thức để đọc và ghi giá trị cho thuộc tính.
 * 4. toString(): Ghi đè phương thức mặc định để xuất chuỗi thông tin nhanh.
 */
public class SanPham {
	// 1. Thuộc tính
	private String maSP;
	private String tenSP;
	private String loaiSP;
	private double giaSP; // Tên biến khớp với toString của bạn

	// 2. Constructor đầy đủ tham số
	public SanPham(String maSP, String tenSP, String loaiSP, double giaSP) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.giaSP = giaSP;
	}

	// 3. Các Getter và Setter
	public String getMaSP() { return maSP; }
	public void setMaSP(String maSP) { this.maSP = maSP; }

	public String getTenSP() { return tenSP; }
	public void setTenSP(String tenSP) { this.tenSP = tenSP; }

	public String getLoaiSP() { return loaiSP; }
	public void setLoaiSP(String loaiSP) { this.loaiSP = loaiSP; }

	public double getGiaSP() { return giaSP; }
	public void setGiaSP(double giaSP) { this.giaSP = giaSP; }

	// 4. Ghi đè phương thức toString() - CHẠY ĐƯỢC KHI GỌI IN ĐỐI TƯỢNG
	@Override
	public String toString() {
		return "Ma san pham: " + maSP + ", ten san pham: " + tenSP + 
			   ", loai san pham: " + loaiSP + ", gia: " + giaSP;
	}

	// 5. Hàm main để thực thi
	public static void main(String[] args) {
		// Tạo đối tượng
		SanPham sp1 = new SanPham("SP001", "Laptop Gaming", "Dien tu", 20000000);
		
		// CÁCH CHẠY: Chỉ cần in biến 'sp1', Java sẽ tự tìm đến hàm toString()
		System.out.println("KET QUA IN RA:");
		System.out.println(sp1); 
	}
}