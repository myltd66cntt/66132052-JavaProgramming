package ntu.ltdmy;

public class Run {

	public static void main(String[] args) {
		// 2.a: Tạo mới 2 HS, hard-code dữ liệu
		HocSinh hs1 = new HocSinh();
		
		String tenHS1 = "Trần Văn A";
		hs1.setTenHS(tenHS1);
		
		short tuoiHS1 = 14;
	    hs1.setTuoiHS(tuoiHS1);
	    
	    String lopHS1 = "8A-12";
	    hs1.setLopHS(lopHS1);
	    
	    HocSinh hs2 = new HocSinh("Trần Thị Tươi", (short)12, "6C");
	    
	    // IN ra màn hình
	    System.out.print(hs1.toString());
	    System.out.print(hs2.toString());

	    
	    System.out.println("\nTên của HS 2 là: " + hs2.getTenHS());
	    System.out.println("Tuổi của HS 2 là: " + hs2.getTuoiHS());
	    System.out.println("Lớp của HS 2 là: " + hs2.getLopHS());
	    
	  //=========================NHẬP DỮ LIỆU TỪ BÀN PHÍM
	    Scanner banPhim = new Scanner(System.in);

	    // Nhập dữ liệu cho học sinh thứ 3
	    HocSinh hs3 = new HocSinh();

	    // 1. Nhập tên
	    System.out.print("Mời nhập tên của học sinh thứ 3: ");
	    String tenHS3 = banPhim.nextLine();
	    hs3.setTenHS(tenHS3);

	    // 2. Nhập tuổi
	    System.out.print("Mời nhập tuổi của học sinh thứ 3: ");
	    short tuoiHS3 = banPhim.nextShort();
	    hs3.setTuoiHS(tuoiHS3);

	    // Xử lý trôi lệnh (quan trọng: sau khi nhập số mà muốn nhập chuỗi tiếp theo)
	    banPhim.nextLine(); 

	    // 3. Nhập lớp
	    System.out.print("Mời nhập lớp của học sinh thứ 3: ");
	    String lopHS3 = banPhim.nextLine();
	    hs3.setLopHS(lopHS3);

	    // In kết quả kiểm tra
	    System.out.println("\n--- Thông tin học sinh thứ 3 vừa nhập ---");
	    System.out.println(hs3.toString());
	}

}
