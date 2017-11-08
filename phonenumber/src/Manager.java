public class Manager {
   PhoneInfo[] array = new PhoneInfo[100];
   int index = 0;

   public void save() {
      array[index++] = readData();
      array[index - 1].showInfo();
   }

   public void search() {
      System.out.println("데이터 검색을 시작합니다...");
      System.out.println("name : ");
      int temp=matchName(Main.sc.nextLine());
      if(temp==-1) {
    	  return;
      }
      array[temp].showInfo();
   }

   public int matchName(String name) {
      for (int tmp = 0; tmp <= index; tmp++) {
         if (name.equals(array[tmp].name)) {
            return tmp;
         }
      }
      System.out.println("찾지 못하였습니다..");
      return -1;
   }

   public void delete() {
	   System.out.println("삭제할 데이터는? ");
	   System.out.println("name : ");
	   matchName(Main.sc.nextLine());
	   del
   }

   private PhoneInfo readData() {
      System.out.println("이름 : ");
      String name = Main.sc.nextLine();
      System.out.println("핸드폰 번호 : ");
      String phoneNumber = Main.sc.nextLine();
      System.out.println("생일 : ");
      String birthday = Main.sc.nextLine();
      PhoneInfo info = new PhoneInfo(name, phoneNumber, birthday);
      return info;
   }

}
