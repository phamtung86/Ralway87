package com.vti.frontend;

import com.vti.entity.Student;
import static com.vti.entity.Student.listStudents;

public class ProgramQuestion2Ex2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.inputInfor();
		s.showInfor();
		for (Student student : listStudents) {
			if(student.checkScholaship()) {
				System.out.println(student.getName() + " danh hoc bong");
			} else {
				System.out.println(student.getName() + " khong danh hoc bong");
			}
		}

	}   
}
