
package com.vti.entity;

public class Sach extends TaiLieu {
    private String tenTG;
    private int soTrang;

    
    public String getTenTG() {
        return tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }
     
    public Sach(String tenTG, int soTrang, String maTL, String tenNXB, int soBanPH) {
        super(maTL, tenNXB, soBanPH);
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

	@Override
	public String toString() {
		return "Sach [tenTG=" + tenTG + ", soTrang=" + soTrang + ", maTL=" + maTL + ", tenNXB=" + tenNXB + ", soBanPH="
				+ soBanPH + "]";
	}
    
   
    
}
