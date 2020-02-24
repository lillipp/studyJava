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
			view.printMsg("�л��� �������� �ʽ��ϴ�.");
		}else {
			students.remove(searchIndex);
		}
	}
	public void modifyStudent() {
		String name = view.getName();
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.printMsg("�л��� �������� �ʽ��ϴ�");
		}else {
			Student s = view.modifyStudent();
			students.set(searchIndex, s);
		}
	}
	public void printOneStudent() {
		String name = view.getName();
		int searchIndex = searchStudent(name); //��� �ε����� ����Ǿ��ִ��� Ȯ���Ѵ�.
		if(searchIndex == -1) {
			view.printMsg("�л��� �������� �ʽ��ϴ�.");
		}else {
			view.printOneStudent(students.get(searchIndex));
		}
	}
	
	public void insertStudent() { // �信�� �޾ƿ� ������ ���� �����͸� �ٲ��ش�. (��Ʈ�ѷ��ǿ���)
		Student s = view.insertStudent();
		students.add(s);
	}
	public int searchStudent(String name) { // �Է¹��� �̸��� ���° �ε����� �ִ��� ã�´�
		for (int i=0;i<students.size();i++) {
			if(students.get(i).getName().equals(name)) {
				return i;
			}
				
		}return -1;
	}
	

}
