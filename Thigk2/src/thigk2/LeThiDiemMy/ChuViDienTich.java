package thigk2.LeThiDiemMy;

import java.util.Scanner;

public class ChiViDienTich {

	/*
	 * TÓM TẮT CÁCH GIẢI:
	 * 1. Sử dụng Scanner(System.in) để nhập tọa độ (x1, y1) và (x2, y2).
	 * 2. Kiểm tra tính hợp lệ: x1 < x2 và y1 > y2.
	 * 3. Tính chiều dài (width) = x2 - x1 và chiều cao (height) = y1 - y2.
	 * 4. Tính chu vi = (chiều dài + chiều cao) * 2.
	 * 5. Tính diện tích = chiều dài * chiều cao.
	 * 6. Xuất kết quả ra màn hình.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, y1, x2, y2;
		
		System.out.print("Nhap x1 (tren-trai): ");
		x1 = sc.nextInt();
		System.out.print("Nhap y1 (tren-trai): ");
		y1 = sc.nextInt();
		System.out.print("Nhap x2 (duoi-phai): ");
		x2 = sc.nextInt();
		System.out.print("Nhap y2 (duoi-phai): ");
		y2 = sc.nextInt();
		
		if (x1 < x2 && y1 > y2) {
			System.out.println("Toa do hop le!");
			
			// b. Tính chu vi và diện tích
			int chieuDai = x2 - x1;
			int chieuCao = y1 - y2;
			
			int chuVi = (chieuDai + chieuCao) * 2;
			int dienTich = chieuDai * chieuCao;
			
			System.out.println("Chu vi hinh chu nhat: " + chuVi);
			System.out.println("Dien tich hinh chu nhat: " + dienTich);
			
		} else {
			System.out.println("Toa do KHONG hop le. Vui long nhap lai.");
		}

		sc.close();
	}
}