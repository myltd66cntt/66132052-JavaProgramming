package thigk2.LeThiDiemMy;

import java.util.Scanner;

public class HinhChuNhat {

	/*
	 * TÓM TẮT CÁCH GIẢI:
	 * 1. Sử dụng thư viện Scanner để nhận dữ liệu từ bàn phím.
	 * 2. Khai báo 4 biến nguyên (x1, y1) và (x2, y2) đại diện cho 2 góc của HCN.
	 * 3. Nhập giá trị cho các tọa độ từ người dùng qua System.in.
	 * 4. Kiểm tra điều kiện hợp lệ: góc trên-trái phải nằm bên trái (x1 < x2) 
	 * và nằm phía trên (y1 > y2) so với góc dưới-phải.
	 * 5. Xuất kết quả thông báo tọa độ có hợp lệ hay không.
	 */
	public static void main(String[] args) {
		// Sửa System.int thành System.in
		Scanner sc = new Scanner(System.in);
		int x1, y1, x2, y2;
		
		System.out.print("Nhap x1 (goc tren-trai): ");
		x1 = sc.nextInt();
		
		System.out.print("Nhap y1 (goc tren-trai): ");
		y1 = sc.nextInt();
		
		System.out.print("Nhap x2 (goc duoi-phai): ");
		x2 = sc.nextInt();
		
		System.out.print("Nhap y2 (goc duoi-phai): ");
		y2 = sc.nextInt();
		
		if (x1 < x2 && y1 > y2) {
			System.out.println("Toa do hop le cho hinh chu nhat.");
		} else {
			System.out.println("Toa do KHONG hop le. Vui long nhap lai.");
		}

		sc.close();
	}
}