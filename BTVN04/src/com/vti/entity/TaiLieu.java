package com.vti.entity;

public class TaiLieu {
    protected String maTL;
    protected String tenNXB;
    protected int soBanPH;
	public TaiLieu(String maTL, String tenNXB, int soBanPH) {
		super();
		this.maTL = maTL;
		this.tenNXB = tenNXB;
		this.soBanPH = soBanPH;
	}
	public String getMaTL() {
		return maTL;
	}
	public void setMaTL(String maTL) {
		this.maTL = maTL;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}
	public int getSoBanPH() {
		return soBanPH;
	}
	public void setSoBanPH(int soBanPH) {
		this.soBanPH = soBanPH;
	}
	@Override
	public String toString() {
		return "TaiLieu [maTL=" + maTL + ", tenNXB=" + tenNXB + ", soBanPH=" + soBanPH + "]";
	}

   
}
