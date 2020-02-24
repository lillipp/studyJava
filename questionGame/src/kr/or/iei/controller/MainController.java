package kr.or.iei.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import kr.or.iei.capital.controller.Congtr;
import kr.or.iei.dialogue.controller.QuizController;
import kr.or.iei.idiom.controller.Controller;
import kr.or.iei.movie.controller.SixQuizController;
import kr.or.iei.person.controller.PersonQuiz;
import kr.or.iei.proverb.controller.ProverbController;
import kr.or.iei.view.MainView;
import kr.or.iei.vo.User;
import kr.or.iei.vo.UserPoint;

public class MainController {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	MainView mainView = new MainView();
	ArrayList<User> userList = new ArrayList<User>();
	ArrayList<String> userIDs = new ArrayList<String>();
	User loginUser;

	public MainController() {

		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("user.txt"));
			userList = (ArrayList<User>) ois.readObject();

			for (User user : userList) {
				userIDs.add(user.getId());
			}

			// System.out.println(userList.get(0).getId());
			// System.out.println(userList.get(0).getPw());

		} catch (FileNotFoundException e) {
			// ������ ���� ��� ������ ���� ����
			User user = new User("master", "master");
			userList.add(user);
			exitProgram();

			try {
				ois = new ObjectInputStream(new FileInputStream("user.txt"));
				userList = (ArrayList<User>) ois.readObject();

				for (User reUser : userList) {
					userIDs.add(user.getId());
				}

			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} finally {
				try {
					ois.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// �α��� ���� ȭ��
	public void login() {

		mainView.printCat();

		while (true) {

			mainView.LoginView();

			try {
				int select = Integer.parseInt(br.readLine());

				switch (select) {
				case 1:
					signIn();
					break;
				case 2:
					signUp();
					break;
				case 0:
					mainView.printDog();
					mainView.printMsg("������ �����մϴ�.");
					exitProgram();
					return;
				default:
					mainView.printMsg("0~2 ������ ���ڸ� �Է��ϼ���.");
				}
			} catch (NumberFormatException e) {
				mainView.printErrMsg("���ڸ� �Է��ϼ���.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				delay();
			}
		}
	}

	// �α��� ���ý�
	public void signIn() {

		User user = mainView.signInView(userList);

		if (user == null) {
			mainView.printMsg("�α��ο� �����ϼ̽��ϴ�.");
		} else {
			loginUser = user;
			mainView.printMsg("�α����ϼ̽��ϴ�.");
			delay();
			mainMenu();
		}

	}

	// ȸ������ ���ý�
	public void signUp() {

		User loginUser = mainView.signUpView(userList);

		if (loginUser == null) {
			mainView.printMsg("ȸ�� ���Կ� �����ϼ̽��ϴ�.");
		} else {
			userList.add(loginUser);
			mainView.printMsg("ȸ�� ���Կ� �����ϼ̽��ϴ�.");
			exitProgram();
		}
	}

	// �α��ν� ���� ȭ��
	public void mainMenu() {

		while (true) {
			mainView.mainMenuView();
			try {
				int select = Integer.parseInt(br.readLine());

				switch (select) {
				case 1:
					selectGame();
					break;
				case 2:
					selectRank();
					break;
				case 0:
					mainView.printDog();
					mainView.printMsg("�α׾ƿ� �մϴ�.");
					return;
				default:
					mainView.printMsg("0~2 ������ ���ڸ� �Է��ϼ���.");
				}
			} catch (NumberFormatException e) {
				mainView.printErrMsg("���ڸ� �Է��ϼ���.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				delay();
			}
		}
	}

	public void selectGame() {

		while (true) {
			mainView.selectGameView();
			
			try {
				int select = Integer.parseInt(br.readLine());
				
				switch (select) {
				case 1:
					// �ι� ����
					PersonQuiz prsonQuiz = new PersonQuiz(loginUser);
					prsonQuiz.main();
					break;
				case 2:
					// ��ȭ ���� ����
					SixQuizController sixQuizCon = new SixQuizController(loginUser);
					sixQuizCon.mainController();
					break;
				case 3:
					// ���ڼ��� ����
					Controller con = new Controller(loginUser);
					con.idiom();
					break;
				case 4:
					// �Ӵ� ����
					ProverbController probCon = new ProverbController(loginUser);
					probCon.selectQueCount();
					break;
				case 5:
					// ���� ����
					Congtr congtr = new Congtr(loginUser);
					congtr.main();
					break;
				case 6:
					// ���� ����
					QuizController quizCon = new QuizController(loginUser);
					quizCon.main1();
					break;
				case 0:
					return;
				default:
					mainView.printMsg("0~6 ������ ���ڸ� �Է��ϼ���.");
				}
			} catch (NumberFormatException e) {
				mainView.printErrMsg("���ڸ� �Է��ϼ���.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				exitProgram();
				delay();
			}
		}
	}

	// ��ŷ ���
	public void selectRank() {

		while (true) {
			mainView.selectRank();
			ArrayList<UserPoint> pointList = new ArrayList<UserPoint>();

			try {
				int select = Integer.parseInt(br.readLine());

				switch (select) {
				case 1:
					// �ι� ����
					for (User user : userList) {
						if (!user.getId().equals("master")) {
							pointList.add(new UserPoint(user.getId(), user.getPersonScore()));
						}
					}
					mainView.printRank(pointList, "�ι�");
					break;
				case 2:
					// ��ȭ ���� ����
					for (User user : userList) {
						if (!user.getId().equals("master")) {
							pointList.add(new UserPoint(user.getId(), user.getMovieScore()));
						}
					}
					mainView.printRank(pointList, "��ȭ");
					break;
				case 3:
					// ���ڼ��� ����
					for (User user : userList) {
						if (!user.getId().equals("master")) {
							pointList.add(new UserPoint(user.getId(), user.getIdiomScore()));
						}
					}
					mainView.printRank(pointList, "���ڼ���");
					break;
				case 4:
					// �Ӵ� ����
					for (User user : userList) {
						if (!user.getId().equals("master")) {
							pointList.add(new UserPoint(user.getId(), user.getProverbScore()));
						}
					}
					mainView.printRank(pointList, "�Ӵ�");
					break;
				case 5:
					// ���� ����
					for (User user : userList) {
						if (!user.getId().equals("master")) {
							pointList.add(new UserPoint(user.getId(), user.getCapitalScroe()));
						}
					}
					mainView.printRank(pointList, "����");
					break;
				case 6:
					// ���� ����
					for (User user : userList) {
						if (!user.getId().equals("master")) {
							pointList.add(new UserPoint(user.getId(), user.getDialogueScore()));
						}
					}
					mainView.printRank(pointList, "����");
					break;
				case 0:
					return;
				default:
					mainView.printMsg("0~6 ������ ���ڸ� �Է��ϼ���.");
				}
			} catch (NumberFormatException e) {
				mainView.printErrMsg("���ڸ� �Է��ϼ���.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				delay();
			}
		}
	}

	// �ý��� ����
	public void exitProgram() {

		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("user.txt"));
			oos.writeObject(userList);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
