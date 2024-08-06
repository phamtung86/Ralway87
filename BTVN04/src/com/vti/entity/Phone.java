package com.vti.entity;

import java.util.ArrayList;

public abstract class Phone {
	public ArrayList<Contacts> listContacts; 
	
	
	public Phone(ArrayList<Contacts> listContacts) {
		super();
		this.listContacts = listContacts;
	}
	
	
	public ArrayList<Contacts> getListContacts() {
		return listContacts;
	}


	public void setListContacts(ArrayList<Contacts> listContacts) {
		this.listContacts = listContacts;
	}


	public abstract void insertContact(String name,String phone);
	public abstract void removeContact(String name);
	public abstract void updateContact(String name, String newPhone);
	public abstract void searchContact(String name);
	
}
