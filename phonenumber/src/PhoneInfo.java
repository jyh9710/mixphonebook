import java.util.*;


public class PhoneInfo {
		String name;
		String phonenum;
		String birthday;
		PhoneInfo(String name, String phonenum, String birthday) {
			this.name = name;
			this.phonenum = phonenum;
			this.birthday = birthday;
		}
		PhoneInfo(String name, String phonenum){
			this.name = name;
			this.phonenum = phonenum;
		}
		public void printperson() {
			System.out.println("���� " + name);
			System.out.println("��ȭ��ȣ " + phonenum);
			if(birthday==null)
			{
			System.out.println("���� ���Է�");
			}
			else System.out.println("���� " + birthday);
		}
}
