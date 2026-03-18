package ntu.myltd;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        // Khai báo biến danh sách, chứa các số nguyên
        ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
        
        // a. Nhập 10 phần tử từ bàn phím
        Scanner banPhim = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            // Nhập 1 phần tử
            // In ra một hướng dẫn cho người dùng
            System.out.print("Mời nhập phần tử thứ " + i + ": ");
            System.out.print("a[" + i + "]=");

            // Cho User nhập, cất vào biến tạm
            Integer tam = banPhim.nextInt();
            
            // Thêm vào cuối danh sách
            dsSoNguyen.add(tam);
        }
        
        // In thông báo đã nhập xong
        System.out.println("Đã nhập xong 10 phần tử vào ArrayList.");
        
        // Giải phóng tài nguyên bộ quét
        banPhim.close();
    }
}