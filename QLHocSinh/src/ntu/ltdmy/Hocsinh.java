package ntu.ltdmy;

public class HocSinh {
	// Các thuộc tính theo yêu cầu
	private String tenHS;
	private short tuoiHS;
	private String lopHS;
	// Các hàm tạo
	public HocSinh() {
		
	}
	
	
	public HocSinh(String tenHS, short tuoiHS, String lopHS) {
		super();
		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
		this.lopHS = lopHS;
	}


	//Getter/Setter
	public String getTenHS() {
		return tenHS;
	}
	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}
	public short getTuoiHS() {
		return tuoiHS;
	}
	public void setTuoiHS(short tuoiHS) {
		this.tuoiHS = tuoiHS;
	}
	public String getLopHS() {
		return lopHS;
	}
	public void setLopHS(String lopHS) {
		this.lopHS = lopHS;
	}


	@Override
	public String toString() {
	    String chuoiXuat;
	    chuoiXuat = "\nHọ và Tên: " + tenHS;
	    chuoiXuat = chuoiXuat + "\nTuổi HS: " + tuoiHS;
	    chuoiXuat = chuoiXuat + "\nLớp HS: " + lopHS;
	    return chuoiXuat;
	//	return "HocSinh [tenHS=" + tenHS + ", tuoiHS=" + tuoiHS + ", lopHS=" + lopHS + "]";
		
	}
    
	
	
	

}
