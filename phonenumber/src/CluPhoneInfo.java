public class CluPhoneInfo extends PhoneInfo {
	String topic = null;

	CluPhoneInfo(String name, String phoneNumber, String topic) {
		super(name, phoneNumber);
		this.topic = topic;
	}

	void showInfo() {
		super.showInfo();
		System.out.println("ажа╕ : " + topic);
	}
}
