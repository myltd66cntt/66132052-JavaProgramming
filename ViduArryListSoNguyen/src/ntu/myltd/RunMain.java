package ntu.myltd;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        // --- KHỞI TẠO ---
        ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
        Scanner banPhim = new Scanner(System.in);

        // --- a. Nhập 10 phần tử từ bàn phím ---
        for (int i = 0; i < 10; i++) {
            System.out.print("Mời nhập phần tử thứ " + i + ": ");
            System.out.print("a[" + i + "]=");
            Integer tam = banPhim.nextInt();
            dsSoNguyen.add(tam);
        }
        System.out.println("\nĐã nhập xong 10 phần tử.");

        // --- b. In ra danh sách vừa nhập ---
        System.out.println("DANH SÁCH VỪA NHẬP LÀ:");
        // Cách dùng for-each (ngắn gọn nhất)
        for (Integer x : dsSoNguyen) {
            System.out.print(x + " ");
        }
        System.out.println(); // Xuống dòng

        // --- c. Đếm số phần tử chẵn ---
        int soLuongPTchan = 0;
        for (Integer x : dsSoNguyen) {
            if (x % 2 == 0) {
                soLuongPTchan++; // Tăng biến đếm lên 1
            }
        }
        System.out.println("Số phần tử chẵn là: " + soLuongPTchan);

        // --- d. Tính tổng các phần tử (Thuật toán cộng dồn) ---
        int TongAll = 0;
        for (Integer x : dsSoNguyen) {
            TongAll = TongAll + x;
        }
        System.out.println("Tổng tất cả các phần tử là: " + TongAll);

        // Giải phóng tài nguyên
        banPhim.close();
        
    } // Kết thúc phương thức main (Dấu này rất quan trọng)
} // Kết thúc class