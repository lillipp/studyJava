package kh.java.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialTest {
	public void main() {
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\user1\\Desktop\\Object.txt");
			oos = new ObjectOutputStream(fos);
			ArrayList<User> list = new ArrayList<User>();
			User user1 = new User("test1", "1234" ,1234,new Score(100,100,100));
			User user2 = new User("test1", "1234" ,1234,new Score(100,100,100));
			User user3 = new User("test1", "1234" ,1234,new Score(100,100,100));
			list.add(user1);
			list.add(user2);
			list.add(user3);
			User user = new User("test","1234",1234, new Score(100,100,100));
			oos.writeObject(user);
			System.out.println("����Ϸ�");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void readObject() {
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\user1\\Desktop\\Object.txt");
			ois = new ObjectInputStream(fis);
			ArrayList<User> list = (ArrayList<User>)ois.readObject();
			
			System.out.println(list.get(0).getId());
			System.out.println(list.get(1).getId());
			System.out.println(list.get(2).getId());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
