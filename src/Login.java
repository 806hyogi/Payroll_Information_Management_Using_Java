
import java.util.Scanner;

//로그인 클래스
public class Login {

// 관리자 아이디 비밀번호 (필드)
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
	// 생성자
	public Login() {
		System.out.println("=========================");
		System.out.println("===== 사원 관리 프로그램 =====");
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

	// 로그인 연산
	public void loginSystem() {

		Scanner sc = new Scanner(System.in);
		System.out.printf("아이디: ");
		String inputId = sc.nextLine();

		System.out.printf("비밀번호: ");
		String inputPw = sc.nextLine();

		// equals()로 비교함.
		if ((inputId.equals(manageId)) && (inputPw.equals(managePw))) {
			System.out.println("관리자 모드 로그인");

//			// printMenu 객체 불러서 클래스 불러오기
//			PrintMenu menu = new PrintMenu();
			menu.printMenu();
		
		} else if((inputId.equals(memberId) && inputPw.equals(memberPw))) {
			// printMenu 객체 불러서 클래스 불러오기
//			PrintMenu menu = new PrintMenu();
			menu.printMenu2(inputId,inputPw);
		}
		
		else {
			System.out.println("등록되지 않은 아이디 입니다.");
			loginSystem();
		}
	}
	public void loginSystem(AddMember addMember) {

		
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("아이디: ");
		String inputId = sc.nextLine();

		System.out.printf("비밀번호: ");
		String inputPw = sc.nextLine();
		
		memberId = addMember.getID(inputId);
		memberPw = addMember.getPW(inputPw);

		// equals()로 비교함.
		if ((inputId.equals(manageId)) && (inputPw.equals(managePw))) {
			System.out.println("관리자 모드 로그인");

//			// printMenu 객체 불러서 클래스 불러오기
//			PrintMenu menu = new PrintMenu();
			menu.printMenu();
		
		} else if((inputId.equals(memberId) && inputPw.equals(memberPw))) {
			// printMenu 객체 불러서 클래스 불러오기
//			PrintMenu menu = new PrintMenu();
			if(menu!=null)
				menu.printMenu2(inputId,inputPw);
		}
		
		else {
			System.out.println("등록되지 않은 아이디 입니다.");
			loginSystem();
		}
	}
	
	
}
