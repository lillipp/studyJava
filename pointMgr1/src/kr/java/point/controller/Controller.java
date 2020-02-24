package kr.java.point.controller;

import java.util.ArrayList;
import java.util.Scanner;

import kr.java.point.view.pointView;
import kr.java.point.vo.Grade;

public class Controller {
	Scanner sc = new Scanner(System.in);
	pointView view = new pointView();
	ArrayList<Grade> grades = new ArrayList<Grade>();
	
	public void main() {
		while(true) {
			
			int select = view.mainMenu();
			switch(select) {
			case 1:
				insertGrade();
				break;
			case 2:
				view.printAll(grades);
				break;
			case 3:
				printOne();
				break;
			case 4:
				modify();
				break;
			case 5:
				delete();
				break;
			case 0:
				break;
			}
		}
	}
	public void insertGrade() {
		Grade g = view.insertGrade();
		grades.add(g);
	}
	public void printOne(){
		String name = view.getName();
		int searchIndex = searchName(name);
		if(searchIndex == -1) {
			view.printMsg("없습니다.");
		}else {
			
			view.printOne(grades.get(searchIndex));
		}
	}
	public int searchName(String name) {
		for(int i=0;i<grades.size();i++) {
			if(grades.get(i).getName().equals(name)) {
				return i;
			}
		}return -1;
	}
	
	public void modify() {
		String name = view.getName();
		int searchIndex = searchName(name);
		if(searchIndex == -1) {
			view.printMsg("없어요");
		}else {
			grades.remove(searchIndex);
			grades.add(view.printModify(name));
			
			
		}
	}
	public void delete() {
		String name = view.getName();
		int searchIndex = searchName(name);
		if(searchIndex == -1) {
			view.printMsg("없습니다");
		}else {
			grades.remove(searchIndex);
		}
	}
	
	
	
	

}
