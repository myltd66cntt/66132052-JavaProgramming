package thigk2.LeThiDiemMy;

/*
 * TÓM TẮT CÁCH GIẢI:
 * 1. Khai báo 4 thuộc tính private: maSP, tenSP, loaiSP và giaSP.
 * 2. Constructor: Hàm khởi tạo để gán giá trị cho 4 thuộc tính trên.
 * 3. Getter/Setter: Các phương thức để đọc và ghi giá trị cho thuộc tính.
 * 4. toString(): Ghi đè phương thức mặc định để xuất chuỗi thông tin nhanh.
 */
public class SanPham {

	private String maSP;
	private String tenSP;
	private String loaiSP;
	private double giaSP; //thuộc tính thứ 4 em tự thêm


	public SanPham(String maSP, String tenSP, String loaiSP, double giaSP) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.giaSP = giaSP;
	}

	r
	public String getMaSP() { return maSP; }
	public void setMaSP(String maSP) { this.maSP = maSP; }

	public String getTenSP() { return tenSP; }
	public void setTenSP(String tenSP) { this.tenSP = tenSP; }

	public String getLoaiSP() { return loaiSP; }
	public void setLoaiSP(String loaiSP) { this.loaiSP = loaiSP; }

	public double getGiaSP() { return giaSP; }
	public void setGiaSP(double giaSP) { this.giaSP = giaSP; }

	@Override
	public String toString() {
		return "Ma san pham: " + maSP + ", ten san pham: " + tenSP + 
			   ", loai san pham: " + loaiSP + ", gia: " + giaSP;
	}

	public static void main(String[] args) {
	
		SanPham sp1 = new SanPham("SP001", "Laptop Gaming", "Dien tu", 20000000);
		
	
		System.out.println("KET QUA IN RA:");
		System.out.println(sp1); 
	}
}
package thigk2.LeThiDiemMy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	/*
	 * TÓM TẮT CÁCH GIẢI:
	 * Sử dụng ArrayList để lưu trữ danh sách sản phẩm.
	 * Tạo sẵn 3 sản phẩm mẫu bằng phương thức add().
	 * Nhập thông tin sản phẩm mới từ bàn phím và thêm vào danh sách.
	 * Duyệt danh sách in toàn bộ và lọc theo loại "Thực phẩm chức năng".
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SanPham> dsSanPham = new ArrayList<>();

		dsSanPham.add(new SanPham("SP01", "Sữa bột", "Thực phẩm", 450000));
		dsSanPham.add(new SanPham("SP02", "Vitamin C", "Thực phẩm chức năng", 150000));
		dsSanPham.add(new SanPham("SP03", "Dầu cá", "Thực phẩm chức năng", 280000));

		System.out.println("--- Danh sách 3 sản phẩm ban đầu ---");
		for (SanPham sp : dsSanPham) {
			System.out.println(sp);
		}

		System.out.println("\n--- Nhập thông tin sản phẩm mới ---");
		System.out.print("Nhập mã sản phẩm: ");
		String ma = sc.nextLine();
		System.out.print("Nhập tên sản phẩm: ");
		String ten = sc.nextLine();
		System.out.print("Nhập loại sản phẩm: ");
		String loai = sc.nextLine();
		System.out.print("Nhập giá bán: ");
		double gia = sc.nextDouble();
		sc.nextLine(); // Xóa bộ nhớ đệm sau khi nhập số

		dsSanPham.add(new SanPham(ma, ten, loai, gia));

		System.out.println("\n--- Danh sách sau khi thêm ---");
		for (SanPham sp : dsSanPham) {
			System.out.println(sp);
		}

		System.out.println("\n--- Các sản phẩm loại 'Thực phẩm chức năng' ---");
		for (SanPham sp : dsSanPham) {
			if (sp.getLoaiSP().equalsIgnoreCase("Thực phẩm chức năng")) {
				System.out.println(sp);
			}
		}

		sc.close();
	}
}