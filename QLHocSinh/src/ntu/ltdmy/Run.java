package ntu.ltdmy;

public class HocSinh {
  
    private String tenHS;
    private short tuoiHS;
    private String lopHS;

    
    public HocSinh() {}
    
    public HocSinh(String tenHS, short tuoiHS, String lopHS) {
        this.tenHS = tenHS;
        this.tuoiHS = tuoiHS;
        this.lopHS = lopHS;
    }


    public void setTenHS(String tenHS) { this.tenHS = tenHS; }
    public String getTenHS() { return tenHS; }

    public void setTuoiHS(short tuoiHS) { this.tuoiHS = tuoiHS; }
    public short getTuoiHS() { return tuoiHS; }

    public void setLopHS(String lopHS) { this.lopHS = lopHS; }
    public String getLopHS() { return lopHS; }

 
    @Override
    public String toString() {
        return "HocSinh [Tên: " + tenHS + ", Tuổi: " + tuoiHS + ", Lớp: " + lopHS + "]\n";
    }
}