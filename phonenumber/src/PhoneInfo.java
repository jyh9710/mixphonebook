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
			System.out.println("성함 " + name);
			System.out.println("전화번호 " + phonenum);
			if(birthday==null)
			{
			System.out.println("생일 미입력");
			}
			else System.out.println("생일 " + birthday);
		}
}
