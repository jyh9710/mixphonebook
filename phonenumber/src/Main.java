import java.util.Scanner;

public class Main {
   public static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      Manager mg = new Manager();
      while (true) {

         switch (showMenu()) {
         case 1:
            mg.save();
            continue;
         case 2:
        	 mg.search();
            continue;
         case 3:
            mg.delete();
            continue;
         case 4:
            break;
         default:
            System.out.println("�߸��� �����Դϴ�.");
            continue;
         }
         System.out.println("����Ǿ����ϴ�");
         break;
      }

   }

   public static int showMenu() {
      System.out.println("�����ϼ���..");
      System.out.println("1.������ �Է�");
      System.out.println("2.������ �˻�");
      System.out.println("3.������ ����");
      System.out.println("4.���α׷� ����");
      System.out.println("���� : ");
      int choose = sc.nextInt();
      sc.nextLine();
      return choose;

   }
}