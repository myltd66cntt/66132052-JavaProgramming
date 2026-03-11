public class run {

    public static void main(String[] args) {
        // Tao mới đối tượng
        ChuNhat cn1 = new ChuNhat();
            // tao đối tượng cn1, dai=10, rong=5
        ChuNhat cn2 = new ChuNhat(20, 15);
        ChuNhat hv = new ChuNhat(20, 20);
        double cn1_dai= cn1.getDai();
        double cn1_rong= cn1.getRong();

        System.out.print("Hinh CN1 co chieu dai la :");
        System.out.print(cn1_dai);
        System.out.print("\nHinh CN1 co chieu rong la :" + cn1_rong);
        
     // Thay đổi chiều dài của CN1
        cn1.setDai(50);
        cn1_dai= cn1.getDai();
        cn1_rong= cn1.getRong();
        System.out.print("Sau khi thay đổi chiều dài \n");
        System.out.print("Hình CN1 có chiều dài là : ");
        System.out.print(cn1_dai);
        System.out.print("\nHình CN1 có chiều rộng là : " + cn1_rong);
    }
}