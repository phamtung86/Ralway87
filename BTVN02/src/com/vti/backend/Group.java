package com.vti.backend;

import java.util.Date;

public class Group {
	String groupId;
	String groupName;
	String creatorId; 
	Date createDate;
	public Group(String groupId, String groupName, String creatorId, Date createDate) {
		this.groupId = groupId;
		this.groupName = groupName;
		this.creatorId = creatorId;
		this.createDate = createDate;
	}
	
	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", groupName=" + groupName + ", creatorId=" + creatorId + ", createDate="
				+ createDate + "]";
	}
	
	
	
}
