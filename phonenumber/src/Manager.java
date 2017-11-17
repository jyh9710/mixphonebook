public class Manager {
	PhoneInfo[] array = new PhoneInfo[100];
	int index = 0;

	public void save() {
	   PhoneInfo info=null;
	   /*switch () {
	case value:
		
		break;

	default:
		break;
	}*/
      array[index++] = info;
      array[index - 1].showInfo(); //????
	}

	public void search() {
		System.out.println("������ �˻��� �����մϴ�...");
		System.out.println("name : ");
		int temp = matchName(Main.sc.nextLine()); // nextLine??
		if (temp == -1) {
			return;
		}
		array[temp].showInfo();
	}

	private int matchName(String name) {
		for (int tmp = 0; tmp <= index; tmp++) {
			if (name.equals(array[tmp].name)) {
				return tmp;
			}
		}
		System.out.println("ã�� ���Ͽ����ϴ�..");
		return -1;
	}

	public void delete() {
		System.out.println("������ �����ʹ�? ");
		System.out.println("name : ");
		int temp = matchName(Main.sc.nextLine());
		for (int tmp = 0; tmp <= index; tmp++) {
			array[tmp] = array[tmp+1];

		}
		index = index-1;
	}



	private PhoneInfo readData() {
		System.out.println("�̸� : ");
		String name = Main.sc.nextLine();
		System.out.println("�ڵ��� ��ȣ : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.println("���� : ");
		String birthday = Main.sc.nextLine();
		PhoneInfo info = new PhoneInfo(name, phoneNumber, birthday);
		return info;
	}

	private PhoneInfo readDataUniv() {
		System.out.println("�̸� : ");
		String name = Main.sc.nextLine();
		System.out.println("�ڵ��� ��ȣ : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.println("���� : ");
		String birthday = Main.sc.nextLine();
		PhoneInfo info = new UnivPhoneInfo(name, phoneNumber);
		return info;
	}

}
