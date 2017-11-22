import java.util.Scanner;

public class Main implements InitMenu{
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Manager mg = new Manager();
		while (true) {

			switch (showMenu()) {
			case INPUT:
				mg.save();
				continue;
			case SEARCH:
				mg.search();
				continue;
			case DELETE:
				mg.delete();
				continue;
			case EXIT:
				break;
			default:
				System.out.println("잘못된 선택입니다.");
				continue;
			}
			System.out.println("종료되었습니다");
			break;
		}

	}

	public static int showMenu() {
		System.out.println("선택하세요..");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.프로그램 종료");
		System.out.println("선택 : ");
		int choose = sc.nextInt();
		sc.nextLine();
		return choose;
	}
	public static int showSelectMenu() {
		System.out.println("데이터 입력을 시작합니다..");
		System.out.println("1.대학 2.회사 3.동아리");
		System.out.println("선택>> ");
		int choose = sc.nextInt();
		sc.nextLine();
		return choose;
	}
}