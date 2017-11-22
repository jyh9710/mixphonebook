public class UnivPhoneInfo extends PhoneInfo {
	String major = null;
	int grade;

	UnivPhoneInfo(String name, String phoneNumber, String birthday,String major, int grade) {
		super(name, phoneNumber,birthday);
		this.major = major;
		this.grade = grade;
	}

	void showInfo() {

		super.showInfo();
		System.out.println("Àü°ø : " + major);
	}
	

}
