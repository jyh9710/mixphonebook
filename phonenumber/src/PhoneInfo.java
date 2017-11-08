public class PhoneInfo {
   String name = null, phoneNumber = null, birthday = null;

   PhoneInfo(String name, String phoneNumber) {
      this.name = name;
      this.phoneNumber = phoneNumber;
   }

   PhoneInfo(String name, String phoneNumber, String birthday) {
      this.name = name;
      this.phoneNumber = phoneNumber;
      this.birthday = birthday;
   }

   void showInfo() {
      System.out.println("입력된 정보 출력...");
      System.out.println("이름 : " + name);
      System.out.println("핸드폰번호 : " + phoneNumber);
      if (birthday == null) {
         System.out.println("생일이 없습니다.");
      }
      System.out.println("생일 : " + birthday);
   }

}