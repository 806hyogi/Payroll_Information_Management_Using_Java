
import java.util.Scanner;

//��� Ŭ����
public class AddMember {

// �ʵ�
	private String memberName;
	private int memberAge;
	private int memberNumber;
	private int memberPay;
	private String memberId;
	private String memberPw;
	private int inputMember;
	private String[] memberAdd; // �̸�, ����, ���ڸ� ���� ����

// ������
	public AddMember() {
		memberAdd = new String[100];
		memberAdd[0] = "�����ȣ: " + 1 + " ���̵�: admin ��й�ȣ: admin@" + " �̸�: ������" + " ����: 0" + " �޿�: 1000";
		memberAdd[1] = "�����ȣ: " + 2 + " ���̵�: user ��й�ȣ: user@" + " �̸�: ���" + " ����: 1" + " �޿�: 200";
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

// �̸�, ����, �����ȣ �Է�
	public void addMember() {

		Scanner sc = new Scanner(System.in);
		System.out.println("����� ����� �Է��Ͻðڽ��ϱ�?");
		inputMember = sc.nextInt();

		// ����� ����� �Է����� ����
		for (int i = 2; i < inputMember + 2; i++) {

			sc.nextLine(); // ���๮�� ����

			System.out.print("�����ȣ: ");
			memberNumber = sc.nextInt();

			System.out.print("���̵�: ");
			memberId = sc.next();

			System.out.print("��й�ȣ: ");
			memberPw = sc.next();

			System.out.print("�̸�: ");
			memberName = sc.next();

			System.out.print("����: ");
			memberAge = sc.nextInt();

			System.out.print("�޿��Է�: ");
			memberPay = sc.nextInt();

			memberAdd[i] = "�����ȣ: " + memberNumber + " ���̵�: " + memberId + " ��й�ȣ: " + memberPw + " �̸�: " + memberName
					+ " ����: " + memberAge + " �޿�: " + memberPay;

			System.out.println();// ����
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

	public String getID(String inputid) {//�迭���� ����� id
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