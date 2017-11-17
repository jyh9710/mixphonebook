
public class UnivPhoneInfo extends PhoneInfo{
	String major=null;
	UnivPhoneInfo(String name, String phoneNumber) {
		super(name, phoneNumber);
		
	}
	@Override
	void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("Àü°ø : "+ major);
	}

}
