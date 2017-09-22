import java.util.*;


public class PhoneInfo {
	PhoneInfo(String name, String phonenum, String birthday) {
		System.out.println("성함 " + name);
		System.out.println("전화번호 " + phonenum);
		System.out.println("생일 " + birthday);
	}
	PhoneInfo(String name, String phonenum) {
		System.out.println("성함 " + name);
		System.out.println("전화번호 " + phonenum);
	}
}
