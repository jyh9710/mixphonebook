import java.util.Scanner;

public class PhoneInfo {
	String name = null;
	String phoneNumber = null;
	String birthday = null;

	PhoneInfo(String name, String phonenum, String birthday) {
		this.name = name;
		this.phoneNumber = phonenum;
		this.birthday = birthday;
	}

	PhoneInfo(String name, String phonenum) {
		this.name = name;
		this.phoneNumber = phonenum;
	}

	public void showInfo() {
		System.out.println("���� " + name);
		System.out.println("��ȭ��ȣ " + phoneNumber);
		if (birthday == null) {
			System.out.println("���� ���Է�");
		} else {
			System.out.println("���� " + birthday);
		}
	}

}