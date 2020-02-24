package kh.java.student.controller;

import java.util.ArrayList;

import kh.java.student.model.vo.Student;
import kh.java.student.view.StudentView;

public class StudentController {
	StudentView view = new StudentView();
	ArrayList<Student> students = new ArrayList<Student>();
	public void main() {
		while(true) {
			int select = view.mainMenu();
			switch(select) {
			case 1:
				insertStudent();
				break;
			case 2:
				view.printAllStudent(students);
				break;
			case 3:
				printOneStudent();
				break;
			case 4:
				modifyStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				return;
			}
		}
	}
	public void deleteStudent() {
		String name = view.getName();
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.printMsg("학생이 존재하지 않습니다.");
		}else {
			students.remove(searchIndex);
		}
	}
	public void modifyStudent() {
		String name = view.getName();
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.printMsg("학생이 존재하지 않습니다");
		}else {
			Student s = view.modifyStudent();
			students.set(searchIndex, s);
		}
	}
	public void printOneStudent() {
		String name = view.getName();
		int searchIndex = searchStudent(name); //몇번 인덱스에 저장되어있는지 확인한다.
		if(searchIndex == -1) {
			view.printMsg("학생이 존재하지 않습니다.");
		}else {
			view.printOneStudent(students.get(searchIndex));
		}
	}
	
	public void insertStudent() { // 뷰에서 받아온 정보를 토대로 데이터를 바꿔준다. (컨트롤러의역할)
		Student s = view.insertStudent();
		students.add(s);
	}
	public int searchStudent(String name) { // 입력받은 이름이 몇번째 인덱스에 있는지 찾는다
		for (int i=0;i<students.size();i++) {
			if(students.get(i).getName().equals(name)) {
				return i;
			}
				
		}return -1;
	}
	

}
