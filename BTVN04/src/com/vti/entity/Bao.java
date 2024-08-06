package com.vti.entity;


public class Bao extends TaiLieu{
    private int ngayPH;
    
    public Bao(int ngayPH, String maTL, String tenNXB, int soBanPH) {
        super(maTL, tenNXB, soBanPH);
        this.ngayPH = ngayPH;
    }

	@Override
	public String toString() {
		return super.toString() + "Bao [ngayPH=" + ngayPH + "]";
	}
    
    
    
}
