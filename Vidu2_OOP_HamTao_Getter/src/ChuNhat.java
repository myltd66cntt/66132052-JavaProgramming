public class ChuNhat {
    // Khai báo các thuộc tính / dữ liệu của lớp / trường thông tin
    private double dai;
    private double rong;

    // ------- Hàm tạo (Constructor)
    public ChuNhat() {
        dai = 10;
        rong = 5;
    }

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public ChuNhat(double daiM, double rongM) {
        dai = daiM;
        rong = rongM;
    }

    // ---------- các getter
    double getDai() {
        return dai;
    }

    double getRong() {
        return rong;
    }

    // ---------- các setter
    void setDai(double daiM) {
        dai = daiM;
    }

    void setRong(double rongM) {
        rong = rongM;
    }

    void setDai(double dai) {
        this.dai = dai;
    }

    void setRong(double rong) {

    }

    // --------- Hàm main để chạy
    public static void main(String[] args) {
        ChuNhat cn = new ChuNhat();

        System.out.println("Chieu dai: " + cn.getDai());
        System.out.println("Chieu rong: " + cn.getRong());

        cn.setDai(20);
        cn.setRong(10);

        System.out.println("Sau khi thay doi:");
        System.out.println("Chieu dai: " + cn.getDai());
        System.out.println("Chieu rong: " + cn.getRong());
    }
}