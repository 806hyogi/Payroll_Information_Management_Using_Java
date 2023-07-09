
import java.util.Scanner;

//�α��� Ŭ����
public class Login {

// ������ ���̵� ��й�ȣ (�ʵ�)
	private String manageId;
	private String managePw;
	private String memberId;
	private String memberPw;
	private String name;
	private int memberNum;
	private AddMember member;
	private String inputId;
	private String inputPw;
	private PrintMenu menu;
	// ������
	public Login() {
		System.out.println("=========================");
		System.out.println("===== ��� ���� ���α׷� =====");
		System.out.println("=========================");
		System.out.println("");
				
		manageId = "admin";
		managePw = "admin@";
		
		memberId = "user";
		memberPw = "user@";
		
		menu = new PrintMenu();
		
	}
	
	public Login(AddMember addMember) {
		member = addMember;
	}

// getter setter
	public String getManageId() {
		return manageId;
	}

	public void setManageId(String manageId) {
		this.manageId = manageId;
	}

	public String getManagePw() {
		return managePw;
	}

	public void setManagePw(String managePw) {
		this.managePw = managePw;
	}
	
	public String getUserId() {
		return memberId;
	}
	public void setUserId(String userId) {
		this.memberId = userId;
	}
	

	public String getUserPw() {
		return memberPw;
	}

	public void setUserPw(String userPw) {
		this.memberPw = userPw;
	}

	public String getInputId() {
		return inputId;
	}

	public void setInputId(String inputId) {
		this.inputId = inputId;
	}

	public String getInputPw() {
		return inputPw;
	}

	public void setInputPw(String inputPw) {
		this.inputPw = inputPw;
	}

	// �α��� ����
	public void loginSystem() {

		Scanner sc = new Scanner(System.in);
		System.out.printf("���̵�: ");
		String inputId = sc.nextLine();

		System.out.printf("��й�ȣ: ");
		String inputPw = sc.nextLine();

		// equals()�� ����.
		if ((inputId.equals(manageId)) && (inputPw.equals(managePw))) {
			System.out.println("������ ��� �α���");

//			// printMenu ��ü �ҷ��� Ŭ���� �ҷ�����
//			PrintMenu menu = new PrintMenu();
			menu.printMenu();
		
		} else if((inputId.equals(memberId) && inputPw.equals(memberPw))) {
			// printMenu ��ü �ҷ��� Ŭ���� �ҷ�����
//			PrintMenu menu = new PrintMenu();
			menu.printMenu2(inputId,inputPw);
		}
		
		else {
			System.out.println("��ϵ��� ���� ���̵� �Դϴ�.");
			loginSystem();
		}
	}
	public void loginSystem(AddMember addMember) {

		
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("���̵�: ");
		String inputId = sc.nextLine();

		System.out.printf("��й�ȣ: ");
		String inputPw = sc.nextLine();
		
		memberId = addMember.getID(inputId);
		memberPw = addMember.getPW(inputPw);

		// equals()�� ����.
		if ((inputId.equals(manageId)) && (inputPw.equals(managePw))) {
			System.out.println("������ ��� �α���");

//			// printMenu ��ü �ҷ��� Ŭ���� �ҷ�����
//			PrintMenu menu = new PrintMenu();
			menu.printMenu();
		
		} else if((inputId.equals(memberId) && inputPw.equals(memberPw))) {
			// printMenu ��ü �ҷ��� Ŭ���� �ҷ�����
//			PrintMenu menu = new PrintMenu();
			if(menu!=null)
				menu.printMenu2(inputId,inputPw);
		}
		
		else {
			System.out.println("��ϵ��� ���� ���̵� �Դϴ�.");
			loginSystem();
		}
	}
	
	
}
