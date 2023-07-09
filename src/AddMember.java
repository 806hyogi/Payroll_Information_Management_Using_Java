
import java.util.Scanner;

//등록 클래스
public class AddMember {

// 필드
	private String memberName;
	private int memberAge;
	private int memberNumber;
	private int memberPay;
	private String memberId;
	private String memberPw;
	private int inputMember;
	private String[] memberAdd; // 이름, 나이, 숫자를 합한 변수

// 생성자
	public AddMember() {
		memberAdd = new String[100];
		memberAdd[0] = "사원번호: " + 1 + " 아이디: admin 비밀번호: admin@" + " 이름: 관리자" + " 나이: 0" + " 급여: 1000";
		memberAdd[1] = "사원번호: " + 2 + " 아이디: user 비밀번호: user@" + " 이름: 사원" + " 나이: 1" + " 급여: 200";
	}

// getter setter

	public int getmemberPay() {
		return memberPay;
	}

	public int getInputMember() {
		return inputMember;
	}

	public void setInputMember(int inputMember) {
		this.inputMember = inputMember;
	}

	public String getmemberId() {
		return memberId;
	}

	public void setmemberId(String userId) {
		this.memberId = userId;

	}

	public String getmemeberPw() {
		return memberPw;
	}

	public void setmemberPw(String userPw) {
		this.memberPw = userPw;
	}

	public void setUserPay(int userPay) {
		this.memberPay = userPay;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String[] getMemberAdd() {
		return memberAdd;
	}

	public void setMemberAdd(String[] memberAdd) {
		this.memberAdd = memberAdd;
	}

// 이름, 나이, 사원번호 입력
	public void addMember() {

		Scanner sc = new Scanner(System.in);
		System.out.println("몇명의 사원을 입력하시겠습니까?");
		inputMember = sc.nextInt();

		// 몇명의 사원을 입력할지 여부
		for (int i = 2; i < inputMember + 2; i++) {

			sc.nextLine(); // 개행문자 제거

			System.out.print("사원번호: ");
			memberNumber = sc.nextInt();

			System.out.print("아이디: ");
			memberId = sc.next();

			System.out.print("비밀번호: ");
			memberPw = sc.next();

			System.out.print("이름: ");
			memberName = sc.next();

			System.out.print("나이: ");
			memberAge = sc.nextInt();

			System.out.print("급여입력: ");
			memberPay = sc.nextInt();

			memberAdd[i] = "사원번호: " + memberNumber + " 아이디: " + memberId + " 비밀번호: " + memberPw + " 이름: " + memberName
					+ " 나이: " + memberAge + " 급여: " + memberPay;

			System.out.println();// 구분
		}
	}

	public String getID() {

		String oneInfo = memberAdd[2];
		String[] info = oneInfo.split(" ");
		String id = info[3];
		return id;
	}

	public String getPW() {
		String oneInfo = memberAdd[2];
		String[] info = oneInfo.split(" ");
		String pw = info[5];
		return pw;
	}

	public String getID(String inputid) {//배열안의 저장된 id
		String id = "";
		for (int i = 0; i < memberAdd.length; i++) {
			if (memberAdd[i]!=null&&memberAdd[i].contains(inputid)) {
				String oneInfo = memberAdd[i];
				String[] info = oneInfo.split(" ");
				id = info[3];
			}
		}
		return id;
	}

	public String getPW(String inputpw) {
		String pw = "";
		for (int i = 0; i < memberAdd.length; i++) {
			if (memberAdd[i]!=null&&memberAdd[i].contains(inputpw)) {
				String oneInfo = memberAdd[i];
				String[] info = oneInfo.split(" ");
				pw = info[5];
			}
		}
		return pw;
	}
}