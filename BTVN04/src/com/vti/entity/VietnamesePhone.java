package com.vti.entity;

import java.util.ArrayList;
import java.util.Iterator;

public class VietnamesePhone extends Phone {
	
	public VietnamesePhone(ArrayList<Contacts> listContacts) {
		super(listContacts);

	}

	@Override
	public void insertContact(String name, String phone) {
		ArrayList<Contacts> listContacts = new ArrayList<Contacts>();
		listContacts = this.getListContacts();
		Contacts contact = new Contacts(name, phone);
		listContacts.add(contact);
		this.setListContacts(listContacts);
	}

	@Override
	public void removeContact(String name) {
		ArrayList<Contacts> listContacts = new ArrayList<Contacts>();
		listContacts = this.getListContacts();
//		for (Contacts contacts : listContacts) {
//			if(name.equals(contacts.getName())) {
//				listContacts.remove(contacts);
//				this.setListContacts(listContacts);
//			}
//		}
		Iterator<Contacts> iterator = listContacts.iterator();
        while (iterator.hasNext()) {
            Contacts c = iterator.next();
            if (c.getName().equals(name)) {
                iterator.remove();
            }
        }
        this.setListContacts(listContacts);
	}

	@Override
	public void updateContact(String name, String newPhone) {
		ArrayList<Contacts> listContacts = new ArrayList<Contacts>();
		listContacts = this.getListContacts();
		for (Contacts contacts : listContacts) {
			if(name.equals(contacts.getName())) {
				contacts.setPhone(newPhone);
			}
		}
		this.setListContacts(listContacts);
	}

	@Override
	public void searchContact(String name) {
		ArrayList<Contacts> listContacts = new ArrayList<Contacts>();
		listContacts = this.getListContacts();
		for (Contacts contacts : listContacts) {
			if(name.equals(contacts.getName())) {
				System.out.println(contacts.toString());
			}
		}
		
	}


	

}
