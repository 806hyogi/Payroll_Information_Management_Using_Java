
import java.util.Scanner;

//���, ����, ��ȸ Ŭ����
public class PrintMenu {
	
	Continue con;
	Scanner sc;
	AddMember addMember;
	DeleteMember deleteMember;
	LookMember lookMember;
	Login login;
	//������
	public PrintMenu() {
		con = new Continue();
		sc = new Scanner(System.in);
		addMember = new AddMember();
		deleteMember = new DeleteMember(addMember);
		lookMember = new LookMember(addMember);
		login  = new Login(addMember);
		
	}
	
	//�޼ҵ�
	public void printMenu() {

		
		// DeleteMember deleteMember = new DeleteMember();

		while (con.getControl()) { 

			System.out.println("======================");
			System.out.println("1. ���");
			System.out.println("2. ����");
			System.out.println("3. ��ȸ");
			System.out.println("4. �α׾ƿ�");
			System.out.println("======================");

			int inputChoice = sc.nextInt();

			switch (inputChoice) {

			case 1:
				System.out.println("��� ��忡 �����߽��ϴ�.");
				System.out.println("======================");

				addMember.addMember();
				
				
				con.asking();
				break;
			case 2:
				System.out.println("���� ��忡 �����߽��ϴ�.");
				System.out.println("======================");

				// deleteMember.lookMember();
				deleteMember.deleteMember();

				con.asking();
				break;
			case 3:
				System.out.println("��ȸ ��忡 �����߽��ϴ�.");
				System.out.println("======================");

				lookMember.lookMember();

				con.asking();
				break;
			case 4:
				System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
				login.loginSystem(addMember);
				break;
			}
			if(inputChoice==4) {
				printMenu2(addMember.getID(),addMember.getPW());
				break;
			}
		}
	}
	//�Ϲ� ��� ����Ʈ �޼ҵ�
		public void printMenu2(String id, String pw) {
			lookMember.lookMember(id, pw);
		}
}
