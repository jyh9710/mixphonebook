public class ComPhoneInfo extends PhoneInfo {
	String department = null;

	ComPhoneInfo(String name, String phoneNumber, String department) {
		super(name, phoneNumber);
		this.department = department;
	}

	void showInfo() {
		super.showInfo();
		System.out.println("ºÎ¼­ : " + department);
	}

}
