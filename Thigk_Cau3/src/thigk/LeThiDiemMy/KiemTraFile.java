package thigk2.LeThiDiemMy;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * TÓM TẮT CÁCH GIẢI:
 * 1. Khai báo biến X là ngày sinh của sinh viên (ví dụ: 23.0).
 * 2. Sử dụng File và PrintWriter để tạo dữ liệu mẫu gồm 80 số thực vào file "data.txt".
 * 3. Sử dụng Scanner(new File(...)) để mở luồng đọc dữ liệu từ file đã tạo.
 * 4. Dùng vòng lặp while(sc.hasNextDouble()) để lấy từng số ra, in lên màn hình.
 * 5. So sánh từng số với X, nếu tìm thấy thì bật biến cờ timThay = true.
 * 6. Xuất kết quả cuối cùng ra màn hình.
 */
public class KiemTraFile {

	public static void main(String[] args) {
		String fileName = "data.txt";
		double X = 23.0; // Thay bằng ngày sinh của bạn
		boolean timThay = false;

		// 1. Tạo file 80 số thực (Sinh viên tự tạo hoặc dùng code này để tạo nhanh)
		try {
			PrintWriter writer = new PrintWriter(new FileWriter(fileName));
			for (int i = 1; i <= 80; i++) {
				// Chèn X vào dòng thứ 10 để test, các dòng khác là số thứ tự .5
				if (i == 10) {
					writer.println(X);
				} else {
					writer.println(i + 0.5);
				}
			}
			writer.close();
			System.out.println("Đã tạo file " + fileName + " thành công.\n");
		} catch (Exception e) {
			System.out.println("Lỗi khi tạo file!");
		}

		// 2. Đọc file và in danh sách, kiểm tra X
		System.out.println("--- DANH SÁCH SỐ THỰC TRONG FILE ---");
		try {
			File file = new File(fileName);
			Scanner reader = new Scanner(file);
			int count = 0;

			while (reader.hasNextDouble()) {
				double giaTri = reader.nextDouble();
				count++;
				System.out.println("Dòng " + count + ": " + giaTri);

				if (giaTri == X) {
					timThay = true;
				}
			}
			reader.close();

			System.out.println("------------------------------------");
			// 3. Kết luận
			if (timThay) {
				System.out.println("=> Kết quả: Giá trị X (" + X + ") CÓ trong danh sách.");
			} else {
				System.out.println("=> Kết quả: Giá trị X (" + X + ") KHÔNG có trong danh sách.");
			}

		} catch (Exception e) {
			System.out.println("Lỗi: Không tìm thấy file data.txt!");
		}
	}
}