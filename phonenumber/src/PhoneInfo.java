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
		System.out.println("성함 " + name);
		System.out.println("전화번호 " + phoneNumber);
		if (birthday == null) {
			System.out.println("생일 미입력");
		} else {
			System.out.println("생일 " + birthday);
		}
	}

}