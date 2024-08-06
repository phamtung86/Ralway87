package com.vti.entity;

import com.vti.backend.VuKhi;

public abstract class DienThoaiDiDong implements VuKhi {
	protected String listen;
	protected String call;
	protected String sendMessage;
	protected String receiveMessage;
	public DienThoaiDiDong(String listen, String call, String sendMessage, String receiveMessage) {
		super();
		this.listen = listen;
		this.call = call;
		this.sendMessage = sendMessage;
		this.receiveMessage = receiveMessage;
	}
	public String getListen() {
		return listen;
	}
	public void setListen(String listen) {
		this.listen = listen;
	}
	public String getCall() {
		return call;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getSendMessage() {
		return sendMessage;
	}
	public void setSendMessage(String sendMessage) {
		this.sendMessage = sendMessage;
	}
	public String getReceiveMessage() {
		return receiveMessage;
	}
	public void setReceiveMessage(String receiveMessage) {
		this.receiveMessage = receiveMessage;
	}
	@Override
	public String toString() {
		return "DienThoaiDiDong [listen=" + listen + ", call=" + call + ", sendMessage=" + sendMessage
				+ ", receiveMessage=" + receiveMessage + "]";
	}
	
}
