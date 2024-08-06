package com.vti.entity;

public class TapChi extends TaiLieu{
    private int soPH;
    private int thangPH;

    public TapChi(int soPH, int thangPH, String maTL, String tenNXB, int soBanPH) {
        super(maTL, tenNXB, soBanPH);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

	@Override
	public String toString() {
		return "TapChi [soPH=" + soPH + ", thangPH=" + thangPH + ", maTL=" + maTL + ", tenNXB=" + tenNXB + ", soBanPH="
				+ soBanPH + "]";
	}
   
    
    
}
