package com.vti.entity;

public class DienThoaiThongMinh extends DienThoaiDiDong {
		private String use3G;
	private String takePhotos;
	public DienThoaiThongMinh(String listen, String call, String sendMessage, String receiveMessage) {
		super(listen, call, sendMessage, receiveMessage);
		// TODO Auto-generated constructor stub
	}

	

	public DienThoaiThongMinh(String listen, String call, String sendMessage, String receiveMessage, String use3g,
			String takePhotos) {
		super(listen, call, sendMessage, receiveMessage);
		use3G = use3g;
		this.takePhotos = takePhotos;
	}

	public String getUse3G() {
		return use3G;
	}

	public void setUse3G(String use3g) {
		use3G = use3g;
	}

	public String getTakePhotos() {
		return takePhotos;
	}

	public void setTakePhotos(String takePhotos) {
		this.takePhotos = takePhotos;
	}

	@Override
	public void tanCongKeXau() {
		// TODO Auto-generated method stub
		
	}

}
