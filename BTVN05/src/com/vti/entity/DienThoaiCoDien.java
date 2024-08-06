package com.vti.entity;

public class DienThoaiCoDien extends DienThoaiDiDong {

	private String listenRadio;
	
	public DienThoaiCoDien(String listen, String call, String sendMessage, String receiveMessage) {
		super(listen, call, sendMessage, receiveMessage);
		// TODO Auto-generated constructor stub
	}

	
	
	public DienThoaiCoDien(String listen, String call, String sendMessage, String receiveMessage, String listenRadio) {
		super(listen, call, sendMessage, receiveMessage);
		this.listenRadio = listenRadio;
	}



	public String getListenRadio() {
		return listenRadio;
	}



	public void setListenRadio(String listenRadio) {
		this.listenRadio = listenRadio;
	}

	@Override
	public void tanCongKeXau() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String toString() {
		return "DienThoaiCoDien [listenRadio=" + listenRadio + "]";
	}
	
	

}
