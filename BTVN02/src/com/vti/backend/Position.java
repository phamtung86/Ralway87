package com.vti.backend;

public class Position {
	int positionId;
	String positionName;
	public Position(int positionId, String positionName) {

		this.positionId = positionId;
		this.positionName = positionName;
	}
	@Override
	public String toString() {
		return "Position [positionId=" + positionId + ", positionName=" + positionName + "]";
	}

	
		
}
